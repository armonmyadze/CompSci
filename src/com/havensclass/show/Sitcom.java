package com.havensclass.show;

public class Sitcom implements Show {
    String name;
    int length;
    String type = "Sitcom";

    public Sitcom(String type, String name, int length) {
        setType(type);
        setName(name);
        setLength(length);
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
        System.out.println("This " + type + " is called " + getName() + " and has a duration of " + getLength() + ".");
    }

    public void setName(String name) {this.name = name;}
}
