package com.gildedrose;

public class ProgressiveItem extends Item implements ItemCalculator {


    public ProgressiveItem(String name, int sellIn, int quality) {
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
        switch (this.name) {
            case "Aged Brie": {
                if (this.quality < 50) {
                    this.quality++;
                    this.sellIn--;
                }
            }
            break;

            case "Backstage passes to a TAFKAL80ETC concert": {
                if (this.sellIn > 10) {
                    this.quality = this.quality + 1;
                    this.sellIn--;
                } else if (this.sellIn > 5) {
                    this.quality = this.quality + 2;
                    this.sellIn--;
                } else if (this.sellIn > 0) {
                    this.quality = this.quality + 3;
                    this.sellIn--;
                }
            }
            if (this.quality > 50) {
                this.quality = 50;
            }
            if (this.quality < 0) {
                this.quality = 0;
            }
            if (this.sellIn < 0) {
                this.sellIn = 0;
            }
        }
    }
}
