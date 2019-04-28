package com.antonsergeichyk.websearch.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConstantUtil {

    public static final String USER_AGENT = "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)";
    public static final int REQUEST_TIMEOUT = 5000;
    public static final String CLASS_ATTRIBUTE = "class";
    public static final String ATTRIBUTE_VALUE = "^link link_theme_normal organic__url.*";
    public static final String HREF_ATTRIBUTE = "href";
    public static final String SPLITTER = " - ";
    public static final String FAILED_RESULT = "no result for your request";
    public static final String QUERY = "enter your query please: \nto exit from application, type: \"exit\"";
    public static final String EXIT = "exit";
}
