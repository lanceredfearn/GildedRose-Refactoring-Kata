package com.gildedrose;

public class ProgressiveItem implements ItemInterface {

    ItemType type;
    String name;
    int sellIn;
    int quality;

    public ProgressiveItem(ItemBuilder item) {
        this.name = item.name;
        this.sellIn = item.sellIn;
        this.quality = item.quality;
        this.type = type;
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
