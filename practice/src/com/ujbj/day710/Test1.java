package com.ujbj.day710;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(random(5));
    }

    public static String random(int len) {
        StringBuffer sb = new StringBuffer();
        Random r = new Random();

        for (int i = 0; i < len - 1; i++) {
            char result = (char) (r.nextInt(26) + (r.nextBoolean() ? 'a' : 'A'));
            sb.append(result);
        }

        sb.append(r.nextInt(10));

        return sb.toString();
    }
}
