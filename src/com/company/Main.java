package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начало эстафеты!");
        Runner runner = new Runner();
        runner.setName("Runner ");
        runner.start();
        try {
            runner.join();
            System.out.println("Конец эстафеты!");
        } catch (InterruptedException ie) {
        }

    }
}

