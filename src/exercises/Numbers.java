package exercises;

public class Numbers {
    public static int[] squaresOfNumbers(int[] numbers){
        int length = numbers.length;
        int[] squares = new int[length];


        for (int i = 0; i < length; i++) {
            squares[i] = numbers[i] * numbers[i];

        }

        return squares;

    }


    public static void main(String[] args){
        int[] numbers = new int[]{1,1,2,3,5,10};
        int[] squares = squaresOfNumbers(numbers);

        for (int square : squares){
            System.out.println(square);
        }

    }
}
