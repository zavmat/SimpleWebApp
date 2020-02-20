package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";

        }
        if (query.toLowerCase().contains("byron")) {
            return "George Gordon Byron, 6th Baron Byron, FRS, known simply as Lord Byron, was an English poet, peer," +
                    "and politician who became a revolutionary in the Greek War of Independence, and is considered one" +
                    "of the leading figures of the Romantic movement.";
        }
        return "";
    }
}
