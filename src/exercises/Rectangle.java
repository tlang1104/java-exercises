package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double length, width;
        System.out.println("Enter the length:");
        length = in.nextDouble();
        System.out.println("Enter the width");
        width = in.nextDouble();
        System.out.println("The area of your rectangle is: "+length*width);
        }
    }
