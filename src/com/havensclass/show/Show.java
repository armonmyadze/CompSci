package com.havensclass.show;

public interface Show{
    String name = "";
    int length = 0;

    public void setLength(int length);
    public int getLength();

    public String getName();

    public String getType();

    public void setType(String string);

    public void printProperties();
}