package com.cabil62113.donutflipscannermod;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public
class MarketAnalysis {
    private static final Map<String, BigDecimal> marketValues = new HashMap<>();

    public static void init() {
        DonutFlipScannerMod.LOGGER.info("Market Analysis initialized");
    }

    public static void updateMarketValues(String itemId, BigDecimal value) {
        marketValues.put(itemId, value);
    }

    public static BigDecimal getMarketValue(String itemId) {
        return marketValues.getOrDefault(itemId, BigDecimal.ZERO);
    }

    public static BigDecimal calculateProfit(BigDecimal buyPrice, BigDecimal sellPrice) {
        return sellPrice.subtract(buyPrice);
    }

    public static BigDecimal calculateMargin(BigDecimal buyPrice, BigDecimal sellPrice) {
        if (buyPrice.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }
        return sellPrice.subtract(buyPrice).divide(buyPrice, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
    }
}
