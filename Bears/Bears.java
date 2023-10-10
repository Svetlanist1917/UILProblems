import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import the ArrayList class

class Bears {
    public static void main(String[] args) {
        try {
            File myFile = new File("bears.dat");
            int bears = 0;
            Scanner myScanner = new Scanner(myFile);
            Boolean terminate = false;
            ArrayList<String> lines = new ArrayList<String>();
            while (myScanner.hasNextLine()){
                lines.add(myScanner.nextLine());
            }
            int index = 0;
            int matrixes = Integer.parseInt(lines.get(index));
            index++;
            for (int i = 0; i < matrixes; i++){
              for(int j = 0; j < 10; j++){
                String googoo = lines.get(index);
                  for (int k = 0; k < 10; k++) {
                      if (googoo.charAt(k) == 'B') {
                          bears++;
                      }
                  }
                  index++;
              }
              System.out.println(bears);
              bears = 0;
            }
            myScanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}