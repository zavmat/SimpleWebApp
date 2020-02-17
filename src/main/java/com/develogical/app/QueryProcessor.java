package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("blake")) {
            return "William Blake was an English poet, painter, and printmaker." +
                    "Largely unrecognised during his lifetime, Blake is now considered" +
                    "a seminal figure in the history of the poetry and visual arts of the Romantic Age.";
        }
        return "";
    }
}
