package com.company;

public class Runner extends Thread {

    public void run() {
        int g = 0;
        int r = 5;
        System.out.println(this.getName() + "1 берет палочку");
        for (int i = 1; i < 9; i++) {
             if (g > 3) {
                System.out.println(this.getName() + r + " бежит к " + this.getName() + (r - 1));
                System.out.println(this.getName() + (r - 1) + " берет палочку");
                r--;
            } else {
                System.out.println(this.getName() + i + " бежит к " + this.getName() + (i + 1));
                System.out.println(this.getName() + (i + 1) + " берет палочку");
                g++;
            }
        }


    }

}
