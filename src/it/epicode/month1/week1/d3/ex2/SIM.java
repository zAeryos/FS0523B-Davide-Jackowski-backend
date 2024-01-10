package it.epicode.month1.week1.d3.ex2;

import java.util.Arrays;

public class SIM {

    private int pNumber;
    private double credit;
    private String[] pastCalls;
    public SIM (int pNumber) {
        this.pNumber = pNumber;
        this.credit = 0;
        this.pastCalls = new String[0];
    }

    public void addCredit (int money) {
        this.credit += money;
    }

    public void makeCall (int number, String duration) {
        if (this.pastCalls.length <= 5) {

        } else if (this.pastCalls.length >= 5) {

        }
    }

    public void showCalls() {
        if (this.pastCalls.length == 0 ) {
            System.out.println("There are no past calls");
        } else {
            for (int i = 0; i < pastCalls.length; i++) {
                System.out.println(pastCalls[i]);
            }
        }
    }

    public void simData() {
        System.out.println("The number is: " + this.pNumber + ", the remanining credit is : " + this.credit + ", the call history is: " + Arrays.toString(this.pastCalls));
    }

}
