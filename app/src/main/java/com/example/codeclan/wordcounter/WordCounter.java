package com.example.codeclan.wordcounter;

import java.util.ArrayList;

public class WordCounter {

    public WordCounter(){
    }

    public String splitWords(String words) {
        String[] wordlist = words.split("\\s+");
        return "You typed " + wordlist.length + " words";
    }

}
