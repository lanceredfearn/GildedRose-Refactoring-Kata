package com.gildedrose;

public class ConjuredItem implements ItemInterface {

    ItemType type;
    String name;
    int sellIn;
    int quality;

    public ConjuredItem(ItemBuilder item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
        this.type = item.type;
    }

    public void calculate() {
        // Need to implement this logic

    }
}
