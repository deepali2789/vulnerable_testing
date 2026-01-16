package com.example;

import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class App {
  public static void main(String[] args) {
    String input = "<tag>Hello \"world\"</tag>";
    System.out.println("Escaped: " + StringEscapeUtils.escapeHtml4(input));

    int dist = LevenshteinDistance.getDefaultInstance().apply("curation", "curation-policy");
    System.out.println("Levenshtein distance: " + dist);
  }
}
