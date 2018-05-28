package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter();

    }

    @Test
    public void canCountWords(){
        assertEquals("You typed 4 words", wordCounter.splitWords("My name is Andy"));
    }

    @Test
    public void canCountWordInstances() {
        Map<String, Integer> expected = new HashMap<String, Integer>() {
            {
                put("How", 1);
                put("much", 1);
                put("wood", 2);
                put("would", 1);
                put("a", 1);
                put("chuck", 2);
                // etc
            }

        };
        assertEquals(expected, wordCounter.countWordInstances("How much wood would a wood chuck chuck"));
    }

}
