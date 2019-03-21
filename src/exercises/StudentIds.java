package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIds {
    public static void main(String[] args){
        HashMap<Integer, String> studentId = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newId;

        System.out.println("Enter Student Id (or ENTER to finish)");

        do{
            System.out.print("Student Id: ");
            newId = in.nextLine();

            if (!newId.equals("")){
                Integer id = Integer.valueOf(newId);
                System.out.print("Name: ");
                String studentName = in.nextLine();
                studentId.put(id, studentName);

                //in.nextLine();
            }
        } while (!newId.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> id : studentId.entrySet()){

            System.out.println("Name: "+id.getValue()+"  Id: "+id.getKey());
        }

    }

}
