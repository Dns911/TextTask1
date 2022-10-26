package com.epam.texttask.alfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlfaParser {

    static final String PARAGRAPH_REGEX = "\\n";
    static final String SENTENCE_REGEX = "\\./\\s?";
    static final String LEXEMA_REGEX = "";

    public List<String> parseToParagraph(String text) {
        List<String> result = new ArrayList<>();
        result = Arrays.stream(text.split(PARAGRAPH_REGEX)).toList();
        return result;
    }

    public List<String> parseToSentence(String text) {
        List<String> result = new ArrayList<>();
        result = Arrays.stream(text.split(SENTENCE_REGEX)).toList();
        return result;
    }

    public List<String> parseToLexema(String text) {
        List<String> result = new ArrayList<>();
        result = Arrays.stream(text.split(LEXEMA_REGEX)).toList();
        return result;
    }

    public char[] parseToSymbol(String text) {
        char[] result = text.toCharArray();
        return result;
    }
}
