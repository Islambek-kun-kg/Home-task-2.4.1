package com.company;

public class Runner extends Thread {

    private int number;
    private int constanta;

    public Runner(String name, int number, int constanta) {
        super(name);
        this.number = number;
        this.constanta = constanta;
    }

    public void run() {
        if (constanta == 1) {
            System.out.println(this.getName() + this.number + " берет палочку");
            System.out.println(this.getName() + this.number + " бежит к " + this.getName() + (this.number + 1));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (this.number == 4) {
                    System.out.println(this.getName() + (this.number + 1) + " берет палочку");
                    System.out.println(this.getName() + (this.number + 1) + " бежит к финишу");
                }
            }
        }
        if (constanta == 2) {
            if (this.number != 5)
                System.out.println(this.getName() + this.number + " берет палочку");
            System.out.println(this.getName() + this.number + " бежит к " + this.getName() + (this.number - 1));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (this.number == 2) {
                    System.out.println(this.getName() + (this.number - 1) + " берет палочку");
                }
            }
        }
    }
}
