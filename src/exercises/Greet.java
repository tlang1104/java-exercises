package exercises;


import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Greet {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Hello "+name+"!");
    }


}