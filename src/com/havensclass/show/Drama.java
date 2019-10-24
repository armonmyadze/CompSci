package com.havensclass.show;

public class Drama implements ShowStars {
    String name;
    int length;
    String type = "Drama";
    String stars;

    public Drama(String type, String name, int length, String stars) {
        setType(type);
        setName(name);
        setLength(length);
        setStars(stars);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String string) {
        type = string;
    }

    @Override
    public void printProperties() {
        System.out.println("This " + type + " is called " + getName() + " has a duration of " + getLength() + " and the star(s) of the show is/are " + getStars() + ".");
    }

    public void setName(String name) {this.name = name;}

    @Override
    public String getStars() {
        return stars;
    }

    @Override
    public void setStars(String stars) {
        this.stars = stars;
    }
}
