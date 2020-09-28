package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void test_Sulfuras() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(10, items[0].quality);
        assertEquals(10, items[0].sellIn);
    }

    @Test
    public void test_general_item() {
        Item[] items = new Item[]{new Item("general_item", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(9, items[0].quality);
        assertEquals(9, items[0].sellIn);
    }

    @Test
    public void test_general_item_2() {
        Item[] items = new Item[]{new Item("general_item", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(8, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void test_Aged_Brie() {
        Item[] items = new Item[]{new Item("Aged Brie", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();


        assertEquals(2, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    public void test_Backstage_passes_to_a_TAFKAL80ETC_concert_1() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();


        assertEquals(9, items[0].sellIn);
        assertEquals(2, items[0].quality);
    }

    @Test
    public void test_Backstage_passes_to_a_TAFKAL80ETC_concert_2() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();


        assertEquals(4, items[0].sellIn);
        assertEquals(3, items[0].quality);
    }

    @Test
    public void test_Backstage_passes_to_a_TAFKAL80ETC_concert_3() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();


        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }


}
