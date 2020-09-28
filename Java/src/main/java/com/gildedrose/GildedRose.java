package com.gildedrose;

import com.gildedrose.stragtegy.GeneralStrategy;
import com.gildedrose.stragtegy.StrategyFactory;

class GildedRose {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    final Item[] items;

    private final StrategyFactory strategyFactory;

    public GildedRose(final Item[] items) {
        this.items = items;
        this.strategyFactory = new StrategyFactory();
    }


    public void updateQuality() {
        for (Item item : items) {
            final GeneralStrategy strategy = strategyFactory.createFor(item);
            strategy.update(item);
        }
    }


}