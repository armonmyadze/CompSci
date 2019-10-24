package com.havensclass.show;

public class TestShows {
    public static void main(String[]args) {
        Sitcom seinfeld = new Sitcom("Sitcom", "Seinfeld", 60);
        Drama greysAnatomy = new Drama("Drama", "Grey's Anatomy", 90, "Dr. Grey");

        seinfeld.printProperties();
        greysAnatomy.printProperties();
    }
}
