package com.pluralsight;

public class GettingLoopy {

    public static void main(String[] args) {

        System.out.println("From for:");
        //for loop example
        for (int i = 11; i <= 10 ; i++) {
            System.out.println(i);
        }

        System.out.println("\n\nFrom While:");
        //while
        int i=11;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        //do while
        System.out.println("\n\nDo While:");

        int j =11;
        do{
            System.out.println(j);
            j++;
        }while(j <= 10);


        System.out.println("\n\ncontinue/break with for:");
        //starting a sum or running total
        int sum = 0;
        for(int k = 1; k <= 20; k++) {
            if (k == 15) {
            //  break;
                continue;
            }
            sum += k;
            System.out.println(k);
        }
        System.out.println("Sum = " + sum);

        System.out.println("\n\n with for and array:");
        //starting a sum or running total
        int anotherSum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for(int k = 0; k < numbers.length; k++) {

            anotherSum += numbers[k];
            System.out.println(numbers[k]);
        }
        System.out.println("AnotherSum = " + anotherSum);

    }

}
