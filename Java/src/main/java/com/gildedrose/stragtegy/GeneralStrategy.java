package com.gildedrose.stragtegy;

import com.gildedrose.Item;

public class GeneralStrategy {

    public void update(Item item) {
        decreaseSellerIn(item);
        decreaseQuality(item);
    }

    void decreaseSellerIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    void decreaseQuality(Item item) {
        int decreaseCount = 1;
        if (isExpired(item)) {
            decreaseCount = 2;
        }
        item.quality = item.quality - decreaseCount;
    }

    boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

}
