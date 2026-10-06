package com.cabil62113.donutflipscannermod;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public
class AuctionMonitor {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void init() {
        DonutFlipScannerMod.LOGGER.info("Auction Monitor initialized");
        startMonitoring();
    }

    private static void startMonitoring() {
        scheduler.scheduleAtFixedRate(() -> {
            DonutSMPAPIClient.getAuctions().thenAccept(response -> {
                // Process auctions
                ItemRecognition.processAuctions(response);
            });
        }, 0, 1, TimeUnit.MINUTES);
    }
}
