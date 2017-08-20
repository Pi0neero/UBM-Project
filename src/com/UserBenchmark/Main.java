package com.UserBenchmark;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        getCpuRankings();
    }

    public static void getCpuRankings() throws IOException {
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(java.util.logging.Level.OFF);

        try (final WebClient webClient = new WebClient()) {
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(true);
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);

            HtmlPage page = webClient.getPage("http://cpu.userbenchmark.com/");


            HtmlTable htmlTable = page.querySelector("#prodListForm > table");

            HtmlTableRow tr = htmlTable.getRow(0);

        }
    }
}
