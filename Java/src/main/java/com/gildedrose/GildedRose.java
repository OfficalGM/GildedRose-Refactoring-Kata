package com.gildedrose;

class GildedRose {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    boolean isEqualToItemName(final Item item, final String name) {
        return item.name.equalsIgnoreCase(name);
    }

    boolean isGreaterThanZero(final Item item) {
        return item.quality > 0;
    }

    boolean isLessThan50(final Item item) {
        return item.quality < 50;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!isEqualToItemName(items[i], AGED_BRIE)
                    && !isEqualToItemName(items[i], BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                if (isGreaterThanZero(items[i])) {
                    if (!isEqualToItemName(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (isLessThan50(items[i])) {
                    items[i].quality = items[i].quality + 1;

                    if (isEqualToItemName(items[i], BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (items[i].sellIn < 11) {
                            if (isLessThan50(items[i])) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (isLessThan50(items[i])) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!isEqualToItemName(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!isEqualToItemName(items[i], AGED_BRIE)) {
                    if (!isEqualToItemName(items[i], BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT)) {
                        if (isGreaterThanZero(items[i])) {
                            if (!isEqualToItemName(items[i], SULFURAS_HAND_OF_RAGNAROS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (isLessThan50(items[i])) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }


}