package com.company;

public class Main {

    public static void main(String[] args) {
	    //Exercise 1
        int a = 14, b = 14;
        boolean aTeen = false,
                bTeen = false;

        if (a >= 13 && a <= 19){
            aTeen = true;
        }
        if(b >= 13 && b <= 19){
            bTeen = true;
        }

        if(aTeen != bTeen){
            System.out.print("Result of exercise 1: teen \n");
        }
        else{
            System.out.print("Result of exercise 1: not teen \n");
        }

        //Exercise 2
        int[] numbersTab = {1, 2, 13, 4, 3};
        int sum = 0;
        for(int i = 0; i< numbersTab.length; i++){
            if(numbersTab[i] != 13){
                sum += numbersTab[i];
            }
            else {
                break;
            }

        }
        System.out.print("Result of exercise 2: " + sum + "\n");

	    //Exercise 3

        int[] numsTab = {5, 2, 1, 8, 1, 2, 3, 5, 6};
        boolean seqFound = false;
        for(int i = 0; i < numsTab.length; i++){
            if(numsTab[i] == 1 && numsTab[i+1] == 2 && (i+2) < numsTab.length && numsTab[i+2] == 3 ){
                seqFound = true;
            }
        }
        System.out.print("Result of exercise 3: " + seqFound + "\n");
    }
}
