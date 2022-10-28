package com.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    GildedRose testRose;

    private void invokeUpdate( int invocationAmount ) {
        for( int i = 0; i < invocationAmount; i++ ) {
            testRose.updateQuality();
        }
    }
    @BeforeEach
    void Setup() {
        Item[] items = new Item[]{
            new Item("foo", 0, 0),
            new Item("bar", 50, 50),
            new Item("dummy", 25, 25),
            new Item("EmptySellInWithQuality", 0, 50),
            new Item("Aged Brie", 25,25),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 20,  10)
        };

        testRose = new GildedRose(items);

    }
    @Test
    void foo() {
        testRose.updateQuality();
        assertEquals("foo", testRose.items[0].name);
    }

    @Test
    void UpdateQualityOfZeroReturnsZero() {
        invokeUpdate(3);
        assertEquals(0, testRose.items[0].quality);
    }

    @Test
    void UpdateQualityDecreasesSellByDateByOne() {
        testRose.updateQuality();
        assertEquals(49, testRose.items[1].sellIn);
        assertEquals(24, testRose.items[2].sellIn);
    }

    @Test
    void UpdateQualityOfAnExpiredItemDecreasesQualityTwiceAsFast() {
        testRose.updateQuality();
        assertEquals(-1, testRose.items[3].sellIn);
        assertEquals(48, testRose.items[3].quality);
    }

    @Test
    void UpdateQualityOfAgedBrieIncreasesInQuality() {
        invokeUpdate(4);
        assertEquals(29, testRose.items[4].quality);
    }

    @Test
    void UpdateQualityIsNeverMoreThanFifty() {
        invokeUpdate(27);
        assertEquals(50, testRose.items[4].quality);
    }

    @Test
    void updateQualityOfSulfurasNeverDecreasesValues() {
        invokeUpdate(13);
        assertEquals(0, testRose.items[5].sellIn);
        assertEquals(80, testRose.items[5].quality);
    }

    @Test
    void updateQualityOfBackstagePassesIncreaseAsSellInGetsCloser() {
        invokeUpdate(5);
        assertEquals(15, testRose.items[6].quality);

        invokeUpdate(6);
        assertEquals(22, testRose.items[6].quality);

        invokeUpdate(5);
        assertEquals(33, testRose.items[6].quality);

        invokeUpdate(5);
        assertEquals(0, testRose.items[6].sellIn);
    }



}
