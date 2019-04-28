package com.antonsergeichyk.websearch.util;

import com.antonsergeichyk.websearch.WebSearcher;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ApplicationRunner {

    public static void run(){
        StringUtil.print(ConstantUtil.QUERY);
        while ((ScannerUtil.get().hasNextLine())) {
            String searchLine= ScannerUtil.get().nextLine();
            if (ConstantUtil.EXIT.equals(searchLine)) {
                break;
            }
            StringUtil.print(WebSearcher.getINSTANCE().findFirstLink(searchLine));
        }
    }
}
