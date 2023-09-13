import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


class Carol {
    public static void main(String[] args) {
        try {
            File myFile = new File("carol.dat");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()){
                String word = myScanner.nextLine();
                int chars_needed = HowManyTillPalinrome(word);
                System.out.println(chars_needed + " character(s) needed to be added to convert " + word + " into a palindrome.");
            }
            myScanner.close();
        } catch (Exception e) {
            System.out.println("err");
        }
    }

    static int HowManyTillPalinrome(String word){
        String og_word = word.toLowerCase();
        int word_length = og_word.length();
        String reversed_word = ReverseWord(og_word);
        int i = 0;
        int j = 0;
        for(i = 0; i < word_length - 1; i++){
            if(reversed_word.equals(og_word)){
                break;
            }
            og_word = og_word.substring(1, og_word.length());
            reversed_word = reversed_word.substring(0, reversed_word.length()-1);
        }
        og_word = word.toLowerCase();
        reversed_word = ReverseWord(og_word);
        for(j = 0; j < word_length - 1; j++){
            if(reversed_word.equals(og_word)){
                break;
            }
            og_word = og_word.substring(0, og_word.length()-1);
            reversed_word = reversed_word.substring(1, reversed_word.length());
        }
        return Min(i, j);
    }

    static String ReverseWord(String word){
        String reversed_word = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reversed_word += word.charAt(i);
        }
        return reversed_word;
    }

    static int Min(int a, int b){
        if(a < b){
            return a;
        }
        return b;
    }
}
