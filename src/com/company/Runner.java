package com.company;

public class Runner extends Thread {

    private int number;
    private int constanta;

    public void run() {
        if (number > 4) {
            if (number == 5)
                System.out.println(getName() + number + " бежит к " + getName() + (number - constanta));
            if ((number - constanta) != 5)
                System.out.println(getName() + (number - constanta) + " берет палочку");
            System.out.println(getName() + (number - constanta) + " бежит к " + getName() + (number - constanta - 1));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if ((number - constanta) == 2) {
                    System.out.println(getName() + (number - constanta - 1) + " берет палочку");
                }
            }
        } else {
            System.out.println(getName() + number + " берет палочку");
            System.out.println(getName() + number + " бежит к " + getName() + (number + 1));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (this.number == 4) {
                    System.out.println(getName() + (number + 1) + " берет палочку");
                    System.out.println(getName() + (number + 1) + " бежит к финишу");
                }
            }
        }
    }

    public Runner(String name, int number, int constanta) {
        super(name);
        this.number = number;
        this.constanta = constanta;
    }

    public int getConstanta() {
        return constanta;
    }

    public void setConstanta(int constanta) {
        this.constanta = constanta;
    }

}
