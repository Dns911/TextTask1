package com.epam.texttask;

import com.epam.texttask.alfa.AlfaParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = """
                This chapter defines standarts.
                Of naming conv. And customized extension. Dfgf naming conv. The customized extension.
                """;
        AlfaParser alfaParser = new AlfaParser();
        List<String> prgrphs = alfaParser.parseToParagraph(str);
        System.out.println(prgrphs.toString());
        List<String> sentnss = alfaParser.parseToSentence(str);
        System.out.println(sentnss.toString());
    }
}
