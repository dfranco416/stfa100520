package com.wozu.stfa.three.tuesday.patterns;

public class TDDExample {

    int count = 4;
    String words = "So much words!";

    public int addOne(){
        return ++count;
    }
    public int multiplyThree(){
        return count * 3;
    }
    public double circumference(){
        return 2 * 3.14 * count;
    }
    public boolean stringContains(){
        if(words.contains("o")){
            return true;
        }
        return false;
    }
}
