package exercises;

import java.util.ArrayList;

public class WordLetterCount {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        String[] words = alice.split("\\W+");

        ArrayList<String> fiveLetterWords = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if (words[i].length() == 5) {
                fiveLetterWords.add(words[i]);
            }
        }
        System.out.println(fiveLetterWords);


    }
}
