package studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double pi = 3.14;
        double r;
        double area;

        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter the Circle radius:");
        r = in.nextDouble();
        if (r < 0) { System.out.println("Your radius has to be a positive number");
        System.exit(1);}

//        while (r<0) {
//            System.out.println("Please inter a positive radius:");
//            r = in.nextDouble();
//        }
        area = pi * r * r;
        System.out.println("Your Circle that has a "+r+" radius, the Area is: "+area);


    }
}
