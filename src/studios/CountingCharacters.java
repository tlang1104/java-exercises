package studios;

import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class CountingCharacters {
    public static void main(String[] args) {

        ArrayList<Integer> charCount = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();

        String stringIn = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";


        char[] charInString = stringIn.toCharArray();
        int count = 0;


        for (int i = 0; i < charInString.length; i++) {
            char tempChar = charInString[i];

            if (!chars.contains(tempChar)) {
                chars.add(tempChar);

                if (charInString[i]== tempChar) {
                    count++;
                    charCount.add(count);


                }


            }


            }

        for (int j = 0; j < chars.size(); j++) {
            System.out.println(chars.get(j) + ":" + charCount.get(j));



        }



    }
}








