package ru.geekbrains.homework1;

public class Main {

    public static void main(String[] args) {
        int res = culcnum(2,4,5,6);
        System.out.println(res);
    }
    public static int culcnum(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
}
