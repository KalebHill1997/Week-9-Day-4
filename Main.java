package com.tts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type 5 numbers and hit enter after each one");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        QuickMaff.Sumandstuff(num1, num2, num3, num4, num5);

        System.out.println("What kind of car model are you looking for today?");
        String whatever = scanner.next();
        CarDealer.carstuff(whatever);
        }
    }
