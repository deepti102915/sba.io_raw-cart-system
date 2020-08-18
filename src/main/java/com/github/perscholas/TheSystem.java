package com.github.perscholas;

import com.github.perscholas.IOConsole;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;
	IOConsole console = new IOConsole();

	TheSystem() throws IOException {
		itemCollection = new HashMap<>();
		if(getClass().getSimpleName().equals("AppSystem"))
			itemCollection = createCollection();
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			console.println("System is unable to add " + item.getItemName() + "to the cart. System only has " + item.getAvailableQuantity() + item.getItemName() + "s");
			return false;
		}
		return true;
	}
	
	public Boolean add(Item item) {
		// Your code here
		if(itemCollection.containsKey(item.getItemName())){
			item.setAvailableQuantity(item.getQuantity() + 1);
			item.setQuantity(item.getQuantity() +1);
			return true;
		}
		itemCollection.put(item.getItemName(),item);
		return true;
	}

	public Item remove(String itemName) {
		// Your code here
		Item tempItem = itemCollection.get(itemName);
		itemCollection.remove(itemName);
		return tempItem;
	}

	public abstract void display();

	public <E> HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public HashMap<String,Item> createCollection() throws IOException {
		HashMap<String,Item> tempMap = new HashMap<String, Item>();
		File file = new File("src/main/resources/sample.txt");
		ArrayList<String[]> builder = new ArrayList<>();
		Files.lines(file.toPath()).forEach(line -> builder.add(line.split("  ")));
		builder.forEach(item -> tempMap.put(item[0],new ItemBuilder().withItemName(item[0]).withItemDesc(item[1]).withItemPrice(Double.parseDouble(item[2])).withAvailableQuantity(Integer.parseInt(item[3])).build()));
		return tempMap;
	}
}
