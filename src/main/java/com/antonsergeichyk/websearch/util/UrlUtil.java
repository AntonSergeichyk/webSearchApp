package com.antonsergeichyk.websearch.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UrlUtil {

    private static final String SCHEME = "https";
    private static final String HOST = "yandex.by";
    private static final String PATH = "search";
    private static final String PARAM = "text";

    public static URI getUri(String request) throws URISyntaxException {
        return new URIBuilder()
                .setScheme(SCHEME)
                .setHost(HOST)
                .setPath(PATH)
                .setParameter(PARAM, request)
                .build();
    }
}
