package com.gildedrose;

public class ItemBuilder {

    ItemType type;
    String name;
    int sellIn;
    int quality;

    public ItemBuilder(Item item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
    }

    public ItemBuilder(String name, int sellIn, int quality, ItemType type) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.type = type;
    }

    public ItemBuilder build() {
        if ((name.equals("Aged Brie")) ||
            (name.equals("Backstage passes to a TAFKAL80ETC concert"))) {
           return new ItemBuilder(name, sellIn, quality, ItemType.Progressive);
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return new ItemBuilder(name, sellIn, quality, ItemType.Legendary);
        } else if (name.contains("Conjured")) {
            return new ItemBuilder(name, sellIn, quality, ItemType.Conjured);
        } else {
            return new ItemBuilder(name, sellIn, quality, ItemType.Standard);
        }
    }
}
