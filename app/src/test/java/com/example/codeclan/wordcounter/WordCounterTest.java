package com.example.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

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

}
