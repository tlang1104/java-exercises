package exercises;

public class EvenNumbers {
    public static void main(String[] args){
        int[] intList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i = 0; i < intList.length; i++){
            if(intList[i] % 2 == 0){
                sum += intList[i];
            }
        }
        System.out.println("The sum of the even numbers = "+sum);

    }
}
