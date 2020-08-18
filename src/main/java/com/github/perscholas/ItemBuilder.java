package com.github.perscholas;

public final class ItemBuilder {
    private String itemDesc;
    private Double itemPrice;
    private Integer quantity;
    private Integer availableQuantity;
    private String itemName;

    ItemBuilder() {
    }

    public static ItemBuilder anItem() {
        return new ItemBuilder();
    }

    public ItemBuilder withItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
        return this;
    }

    public ItemBuilder withItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    public ItemBuilder withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemBuilder withAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    public ItemBuilder withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public Item build() {
        Item item = new Item(itemName);
        item.setItemDesc(itemDesc);
        item.setItemPrice(itemPrice);
        item.setQuantity(quantity);
        item.setAvailableQuantity(availableQuantity);
        return item;
    }
}