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

            ItemCalculator currentItem = new ItemBuilder(item).build();
            System.out.println(currentItem.getClass());
            currentItem.calculate();
            item.quality = currentItem.getQuality();
            item.sellIn = currentItem.getSellIn();

        });
    }
}
