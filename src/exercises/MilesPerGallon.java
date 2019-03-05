package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner in;
        double miles;
        double gas;
        double milesPerGallon;

        in = new Scanner(System.in);

        System.out.println("Please input how many miles you have driven:");
        miles = in.nextDouble();
        System.out.println("Please input how many gallons of gas was consumed:");
        gas = in.nextDouble();
        milesPerGallon = miles/gas;
        System.out.println("Your vehicle gets "+milesPerGallon+" miles per gallon of gas.");

    }

}
