package com.cabil62113.donutflipscannermod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class DonutFlipScannerMod implements ModInitializer {
    public static final String MOD_ID = "donutflipscannermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing DonutFlipScannerMod");
        // Initialize all components
        DonutSMPAPIClient.init();
        AuctionMonitor.init();
        ItemRecognition.init();
        MarketAnalysis.init();
        TradingDashboard.init();
        ConfigManager.init();
    }
}
