package com.gildedrose;

public class StandardItem implements ItemInterface {

    ItemType type;
    String name;
    int sellIn;
    int quality;

    public StandardItem(ItemBuilder item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
        this.type = item.type;
    }

    public void calculate() {
        if (this.sellIn <= 0) {
            this.quality = this.quality - 2;
        } else {
            this.quality--;
        }
        this.sellIn--;
        if (this.quality < 0) {
            this.quality = 0;
        }
    }
}
