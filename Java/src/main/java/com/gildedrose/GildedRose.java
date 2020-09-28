package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    boolean isEqualToItemName(final Item item, final String name) {
        return item.name.equalsIgnoreCase(name);
    }

    boolean isGreaterThanZero(Item item) {
        return item.quality > 0;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isEqualToItemName(items[i], "Aged Brie")
                    && !isEqualToItemName(items[i], "Backstage passes to a TAFKAL80ETC concert")) {
                if (isGreaterThanZero(items[i])) {
                    if (!isEqualToItemName(items[i], "Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (isEqualToItemName(items[i], "Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!isEqualToItemName(items[i], "Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isEqualToItemName(items[i], "Aged Brie")) {
                    if (!isEqualToItemName(items[i], "Backstage passes to a TAFKAL80ETC concert")) {
                        if (isGreaterThanZero(items[i])) {
                            if (!isEqualToItemName(items[i], "Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }


}