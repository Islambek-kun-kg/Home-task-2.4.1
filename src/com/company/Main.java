package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начало эстафеты!");
        for (int i = 1; i < 5; i++) {
            Runner runner = new Runner("Runner ", i);
            try {
                runner.start();
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}