package com.gildedrose;

public class ConjuredItem extends Item implements ItemCalculator {


    public ConjuredItem(String name, int sellIn, int quality) {
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
    public void calculate() {
        // Need to implement this logic

    }
}
