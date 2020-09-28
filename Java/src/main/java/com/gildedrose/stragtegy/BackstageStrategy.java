package com.gildedrose.stragtegy;

import com.gildedrose.Item;

public class BackstageStrategy extends GeneralStrategy {

    @Override
    public void update(Item item) {
        decreaseSellerIn(item);
        increaseQuality(item);

        if (item.sellIn < 11) {
            increaseQuality(item);
        }

        if (item.sellIn < 6) {
            increaseQuality(item);
        }

        if (isExpired(item)) {
            dropQuality(item);
        }
    }

    void dropQuality(Item item) {
        item.quality = 0;
    }

}
