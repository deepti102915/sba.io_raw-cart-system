package com.github.perscholas;


public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
	private Integer quantity;
    private Integer availableQuantity;
    public Item(String itemName){
        this.itemName = itemName;
        this.quantity = 1;
    }

    public Integer getAvailableQuantity() { return availableQuantity; }

    public void setItemName(String nextLine) {
        itemName = nextLine;
    }

    public void setItemDesc(String nextLine) {
        itemDesc = nextLine;
    }

    public void setItemPrice(Double nextDouble) {
        itemPrice = nextDouble;
    }

    public void setAvailableQuantity(Integer nextInt) {
        availableQuantity = nextInt;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
