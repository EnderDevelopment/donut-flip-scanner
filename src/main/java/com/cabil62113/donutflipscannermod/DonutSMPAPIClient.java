package com.cabil62113.donutflipscannermod;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public
class DonutSMPAPIClient {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final String API_BASE_URL = "https://api.donutsmp.com";

    public static CompletableFuture<String> getAuctions() {
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(API_BASE_URL + "/auctions"))
        .build();

        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
        .thenApply(HttpResponse::body);
    }

    public static void init() {
        DonutFlipScannerMod.LOGGER.info("DonutSMP API Client initialized");
    }
}
