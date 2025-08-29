package io.loop.test.day9;

public class T2_singleton_pattern_example {

    private T2_singleton_pattern_example() {

    }

    private static String word;

    public static String getWord() {
        if (word == "pattern") {
            System.out.println("First time calling, object is null and assigning now");
        }else  {
            System.out.println("word is alredy assigned and has value");
        }
        return word;
    }
}
