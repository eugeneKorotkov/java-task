package ru.korotkov.javaexam;

public class Main
{
    public static void main(String[] args)
    {
        Pair pairFirst = new Pair<String, Integer>("5", 4);
        Pair pairSecond = new Pair<String, Integer>("6", 4);
        Pair pairThird = new Pair<Integer, String>(2, "2");
        Pair pairFourth = new Pair<String, Integer>("5", 4);
        //results: false, false, false, true
        System.out.println("results: " + pairFirst.equals(pairSecond) + ", " + pairSecond.equals(pairThird) + ", " + pairFirst.equals(pairThird) + ", " + pairFirst.equals(pairFourth));
    }
}
