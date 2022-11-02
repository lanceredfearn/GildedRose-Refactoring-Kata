package com.gildedrose;

public class ItemBuilder extends Item {

    public ItemBuilder(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    public ProgressiveItem progressiveItem(Item item) {
        return new ProgressiveItem(item.name, item.sellIn, item.quality);
    }

    public LegendaryItem legendaryItem(Item item) {
        return new LegendaryItem(item.name, item.sellIn, item.quality);
    }

    public ConjuredItem conjuredItem(Item item) {
        return new ConjuredItem(item.name, item.sellIn, item.quality);
    }

    public StandardItem standardItem(Item item) {
        return new StandardItem(item.name, item.sellIn, item.quality);
    }

    public ItemCalculator build() {
        if ((name.equals("Aged Brie")) ||
            (name.equals("Backstage passes to a TAFKAL80ETC concert"))) {

           return progressiveItem(this);

        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {

            return legendaryItem(this);

        } else if (name.contains("Conjured")) {

            return conjuredItem(this);

        } else {

            return standardItem(this);
        }
    }
}
