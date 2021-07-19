package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    private static void task1() {
        int a=123456789;
        for (int i = 9; i<=81; i+=9){
            System.out.println(a*i);
        }
    }

    private static void task5() {
        System.out.println("Введите число a: ");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println("Введите число b: ");
        int b= scanner.nextInt();
        System.out.println("Шаг: ");
        float h= scanner.nextFloat();
        if(h>0) {
            if (a < b) {
                for (float i = a; i < b; i += h) {
                    System.out.printf("%.2f %10f %10f\n", i, Math.tan(i), (1 / Math.tan(i)) + 1);
                }
            } else {
                for (float i = b; i < a; i += h) {
                    System.out.printf("%.2f %10f %10f\n", i, Math.tan(i), (1 / Math.tan(i)) + 1);
                }
            }
        }else {
            System.out.println(" Я буду очень дооолго считать");
        }
    }

    private static void task4() {
        System.out.println("Введите число x: ");
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        double result = 0;
        int[]array = {3,5,7,9,11,13};
        result = x-(Math.pow(x,array[0])/factorial(array[0]))+(Math.pow(x,array[1])/factorial(array[1]))-(Math.pow(x,array[2])/factorial(array[2]))+(Math.pow(x,array[3])/factorial(array[3]))-(Math.pow(x,array[4])/factorial(array[4]))+(Math.pow(x,array[5])/factorial(array[05]));
        System.out.println(result);
    }

    public static long factorial(int n){
        long f = 1;
        for (int i = 1; i<=n;i++){
            f*=i;
        }
        return f;
    }

    private static void task3() {
        int x=2;
        do {
            System.out.printf("sin %d = %10f\n",x, Math.sin(x));
            x++;
        }while (x<=20);
    }

    private static void task2() {
        int y = 7;
        for (int i= 1; i<=10;i++){
            System.out.printf("7 * %2d = %3d \n",i,y*i);
        }
    }
}
