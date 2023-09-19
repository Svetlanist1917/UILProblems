import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


class Carla {
    public static void main(String[] args) {
        try {
            File myFile = new File("carla.dat");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()){
                String word = myScanner.nextLine();
                switch(word.substring(0, 1)){
                    case "F":
                        System.out.print("-");
                        break;
                    case "D":
                        System.out.print("d");
                        break;
                    case "L":
                        System.out.print("l");
                        break;
                }
                Prints(word);
                System.out.println("");
            }
            myScanner.close();
        } catch (Exception e) {
            System.out.println("err");
        }
    }

    public static void Prints(String word){
        for(int i = 0; i < 3; i++){
            String x = word.substring(i+1, i+2);
            switch(x){
                case "0":
                    System.out.print("---");
                     break;
                case "1":
                     System.out.print("--x");
                     break;
                case "2":
                    System.out.print("-w-");
                     break;
                case "3":
                    System.out.print("-wx");
                     break;
                case "4":
                    System.out.print("r--");
                     break;
                case "5":
                    System.out.print("r-x");
                     break;
                case "6":
                    System.out.print("rw-");
                     break;
                case "7":
                     System.out.print("rwx");
                     break;
            }
        }
    }
}