package com.gildedrose;

public class StandardItem extends Item implements ItemCalculator {


    public StandardItem(String name, int sellIn, int quality) {
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
        if (this.sellIn <= 0) {
            this.quality = this.quality - 2;

        }
        else { this.quality--; }

        this.sellIn--;

        if (this.quality < 0) {
            this.quality = 0;
        }
    }
}
