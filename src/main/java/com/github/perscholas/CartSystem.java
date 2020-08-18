package com.github.perscholas;

import com.github.perscholas.IOConsole;

import java.io.IOException;


public class CartSystem extends TheSystem {
	IOConsole console = new IOConsole();
	CartSystem() throws IOException {
		super();
	}

	@Override
	public void display() {
		// Your code here
		getItemCollection().forEach((s, item) -> console.print(s + " price: " + item.getItemPrice()) );
		double sum = getItemCollection().values().stream().mapToDouble(item -> item.getQuantity() * item.getItemPrice()).sum();
		System.out.println("Sum: " + sum);
	}
}
