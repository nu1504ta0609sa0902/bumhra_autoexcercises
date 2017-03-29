package com.test.practice.automation._others.testground;

public class Hello2 {

    public static void main(String args[]){
        Print pr1= new Print();

        int numberOfTimesToRun = 2;
        pr1.message(numberOfTimesToRun, "Run 2 Times");

        numberOfTimesToRun = 4;
        pr1.message(numberOfTimesToRun, "Run 4 Times");

        numberOfTimesToRun = 6;
        pr1.message(numberOfTimesToRun, "Run 6 Times");
    }
}


class Print{

    public void message(int numberOfTimesToRun, String message)

    {
        System.out.println("\nNumber of times to loop : " + numberOfTimesToRun);
        for(int i=0; i<=numberOfTimesToRun; i++){
            System.out.println(message);
        }

    }


}


