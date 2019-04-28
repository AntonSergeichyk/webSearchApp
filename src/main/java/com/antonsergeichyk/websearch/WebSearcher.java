package com.antonsergeichyk.websearch;

import com.antonsergeichyk.websearch.util.ConstantUtil;
import com.antonsergeichyk.websearch.util.UrlUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class WebSearcher {

    private static final WebSearcher INSTANCE = new WebSearcher();

    public String findFirstLink(String searchLine) {
        Optional<String> searchResult = Optional.empty();
        try {
            Document doc = Jsoup.connect(UrlUtil.getUri(searchLine).toString())
                    .userAgent(ConstantUtil.USER_AGENT)
                    .timeout(ConstantUtil.REQUEST_TIMEOUT).get();

            Elements elements = doc.getElementsByAttributeValueMatching(
                    ConstantUtil.CLASS_ATTRIBUTE, ConstantUtil.ATTRIBUTE_VALUE);

            searchResult = elements.stream()
                    .map(it -> it.attr(ConstantUtil.HREF_ATTRIBUTE) + ConstantUtil.SPLITTER + it.text())
                    .findFirst();
        } catch (URISyntaxException | IOException e) {
            e.getMessage();
        }

        return searchResult.orElse(ConstantUtil.FAILED_RESULT);
    }

    public static WebSearcher getINSTANCE() {
        return INSTANCE;
    }
}
