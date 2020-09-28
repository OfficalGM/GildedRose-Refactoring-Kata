package com.gildedrose.stragtegy;

import com.gildedrose.Item;

public class AgedBrieStrategy extends GeneralStrategy {

    @Override
    public void update(Item item) {
        decreaseSellerIn(item);
        increaseQuality(item);
        increaseQuality(item);
    }

}
