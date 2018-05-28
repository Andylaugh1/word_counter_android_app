package com.example.codeclan.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public WordCounter(){
    }

    public String splitWords(String words) {
        String[] wordlist = words.split("\\s+");
        return "You typed " + wordlist.length + " words";
    }

    public Map<String, Integer> countWordInstances(String words) {
        String[] wordlist = words.split("\\s+");
        Map<String, Integer> instances = new HashMap<String, Integer>();

        for (int i=0 ; i<wordlist.length ; i++) {
            if (instances.containsKey(wordlist[i])) {
                int cont = instances.get(wordlist[i]);
                instances.put(wordlist[i], cont + 1);
            } else {
                instances.put(wordlist[i], 1);
            }
        }
        return instances;
    }



}
