package com.company;

public class Runner extends Thread {

    private int number;

    public Runner(String name, int number) {
        super(name);
        this.number = number;
    }

    public void run() {
        System.out.println(this.getName() + this.number + " берет палочку");
        System.out.println(this.getName() + this.number + " бежит к " + this.getName() + (this.number + 1));
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (this.number == 4) {
                System.out.println(this.getName() + (this.number + 1) + " берет палочку");
                System.out.println(this.getName() + (this.number + 1) + " бежит к финишу");
            }
        }
        if (this.number == 4) {
            for (int i = this.number + 1; i > 0; i--) {
                if (i == 1) {
                    System.out.println(this.getName() + i + " берет палочку");
                    break;
                }

                if (i == 5) {
                    System.out.println(this.getName() + i + " бежит к " + this.getName() + (i - 1));
                } else {
                    System.out.println(this.getName() + i + " берет палочку");
                    System.out.println(this.getName() + i + " бежит к " + this.getName() + (i - 1));
                }
                try {
                    sleep(1000);
                } catch (InterruptedException r) {
                    r.printStackTrace();
                }


            }
        }
    }
}
