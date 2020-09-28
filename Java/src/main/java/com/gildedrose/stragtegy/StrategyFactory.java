package com.gildedrose.stragtegy;

import com.gildedrose.Item;

public class StrategyFactory {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    public GeneralStrategy createFor(Item item) {

        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrieStrategy();
            case BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT:
                return new BackstageStrategy();
            case SULFURAS_HAND_OF_RAGNAROS:
                return new SulfurasStrategy();
            default:
                return new GeneralStrategy();
        }
    }

}
