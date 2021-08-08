package com.songr.songr;

import java.util.Locale;

public class Capitaize {

    private String word;

    public Capitaize(String  word) {
        this.word = word;
    }

    public String  getWord() {
        return word.toUpperCase(Locale.ROOT);
    }



}
