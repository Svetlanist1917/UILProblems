import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


class Arti {
    public static void main(String[] args) {
        try {
            File myFile = new File("arti.dat");
            Scanner myScanner = new Scanner(myFile);
            while (myScanner.hasNextLine()){
                String line = myScanner.nextLine();
                float num = Float.parseFloat(line);
                System.out.printf("%s %.3f\n",line, Math.sqrt(num));
            }
            myScanner.close();
        } catch (Exception e) {
            System.out.println("err");
        }
    }
}
