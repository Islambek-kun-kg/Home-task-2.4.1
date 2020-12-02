package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начало эстафеты!");
        int j = -9;
        for (int i = 1; i < 8; i++) {
            Runner runner = new Runner("Runner ", i, 1);
            runner.setConstanta(j = j + 2);
            try {
                runner.start();
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}