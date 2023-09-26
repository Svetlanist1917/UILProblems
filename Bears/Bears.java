import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bears {
    public static void main(String[] args) {
        int bears = 0;

            File data = new File("Bears.dat");
            Scanner Reader = new Scanner(data);
            while (Reader.hasNextLine()) {
                String text = Reader.nextLine();
                for (int index = 0; index < text.length(); index++) {
                    if (text.charAt(index) == 'B') {
                        count++;
                }catch(Exception ohNo){
                    System.err.println("No File Found!");
                }
            }
        }
    }
}