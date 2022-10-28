package com.gildedrose;


public class LegendaryItem implements ItemInterface {

    ItemType type;
    String name;
    int sellIn;
    int quality;

    public LegendaryItem(ItemBuilder item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
        this.type = type;
    }

    @Override
    public void calculate() {
        this.quality = 80;
        this.sellIn = 0;
    }

    @Override
    public String toString() {
        return "LegendaryItem{" +
            "type=" + type +
            ", name='" + name + '\'' +
            ", sellIn=" + sellIn +
            ", quality=" + quality +
            '}';
    }
}
