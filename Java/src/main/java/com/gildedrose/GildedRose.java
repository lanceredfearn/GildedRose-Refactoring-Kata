package com.gildedrose;

import java.util.Arrays;
import java.util.stream.Stream;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Stream<Item> allItems = Arrays.stream(items);

        allItems.forEach(item -> {

            ItemBuilder currentItem = new ItemBuilder(item).build();

            if (currentItem.type == ItemType.Legendary) {
                LegendaryItem legendaryItem = new LegendaryItem(currentItem);
                legendaryItem.calculate();
            } else if (currentItem.type == ItemType.Progressive) {
                ProgressiveItem progressiveItem = new ProgressiveItem(currentItem);
                progressiveItem.calculate();
            } else if (currentItem.type == ItemType.Conjured) {
                ConjuredItem conjuredItem = new ConjuredItem(currentItem);
                conjuredItem.calculate();
            } else {
                StandardItem standardItem = new StandardItem(currentItem);
                standardItem.calculate();
            }
        });
    }
}
