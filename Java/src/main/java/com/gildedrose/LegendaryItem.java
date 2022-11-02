package com.gildedrose;


public class LegendaryItem extends Item implements ItemCalculator {

    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSellIn() {
        return this.sellIn;
    }

    @Override
    public int getQuality() {
        return this.quality;
    }

    @Override
    public void calculate() {
        this.quality = 80;
        this.sellIn = 0;
    }

    @Override
    public String toString() {
        return "LegendaryItem{" +
            ", name='" + name + '\'' +
            ", sellIn=" + sellIn +
            ", quality=" + quality +
            '}';
    }
}
