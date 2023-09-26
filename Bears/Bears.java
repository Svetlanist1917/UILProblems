import java.io.File;
import java.util.Scanner;

class Bears
    public static void main(String[] args) {
    try{
        File data = new File("Bears.dat");
        int bears = 0;
        Scanner Reader = new Scanner(data);
        while (Reader.hasNextLine()){
            String word = Reader.nextLine();

        } catch (Exception ohNo){
            System.err.println("No File Found!");
        }
    }
}