package com.company;




public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a number");
        //int input = scanner.nextInt();

        for (int i = 1; i<=100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println( i + " is divisible by both 3 and 5 a.k.a " + " FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println( i + " is divisible by 3 a.k.a " + " Fizz");
            }else if (i % 5 == 0){
                System.out.println(i + " is divisible by 5 a.k.a " + " buzz");
            }else {
                System.out.println( i + " is nether divisible by 3 nor by 5");
            }
        }


    }
}
