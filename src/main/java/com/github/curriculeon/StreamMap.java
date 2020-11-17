package com.github.curriculeon;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 5/24/17.
 */
public class StreamMap {
    /**
     * Section 8.3
     *
     * @param someWord - word to convert to Stream<String>
     * @return - a Stream of single characters
     */ //TODO
    public static Stream<String> letters(String someWord) {
        String[] words = someWord.split("");
        return Arrays.asList(words).stream();
    }

    /**
     * @param someWords - variable amount of String arguments
     * @return - a Stream of several Streams of single characters
     */ //TODO
    public static Stream<Stream<String>> wordsMap(String... someWords) {
        return Arrays.asList(someWords).stream().map(word -> letters(word));
    }

    /**
     * @param stringArray - variable amount of String arguments
     * @return - a Stream of several Streams of single characters
     */ //TODO
    public static Stream<String> wordsFlatMap(String... stringArray) {
        return Arrays.asList(stringArray).stream().flatMap(word -> letters(word));
    }
}