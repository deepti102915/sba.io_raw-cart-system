package com.github.perscholas;
import com.github.perscholas.IOConsole;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AppSystem extends TheSystem {
	IOConsole console = new IOConsole();
	HashMap<String, Item> systemItems;

	AppSystem() throws IOException {
		super();
		systemItems = super.createCollection();
	}



	@Override
	public void display() {
		// Your code here
		systemItems.forEach((itemName, item) ->  console.println(itemName + " quantity: " + item.getAvailableQuantity()));
	}

	@Override
	public <E> HashMap<String,Item> getItemCollection() {
		return systemItems;
	}

	@Override
	public Boolean add(Item item) {
		// Your code here
		if(item == null)
			return false;
		if(getItemCollection().containsKey(item.getItemName())){
			console.println(item.getItemName() + "Already in App System");
			return false;
		}
		systemItems.put(item.getItemName(),item);
		return true;
	}
}
