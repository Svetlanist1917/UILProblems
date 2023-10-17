import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList; // import the ArrayList class
import java.util.Random; // import random

class Family {
    public static void main(String[] args) {
        try {
            File myFile = new File("family.dat");
            int amountt_of_lines = 0;
            //int bears = 0;
            Scanner myScanner = new Scanner(myFile);
            //Boolean terminate = false;
            ArrayList<String> lines = new ArrayList<String>();
            ArrayList<FamGen> famgen_list = new ArrayList<FamGen>();
            while (myScanner.hasNextLine()){
                lines.add(myScanner.nextLine());
                amountt_of_lines++;
            }

            for(int i = 0; i < amountt_of_lines; i++){
                String i_line = lines.get(i);
                String first_name;
                String second_name;
                int index = 0;
                while(i_line.charAt(index) != ' '){
                    index++;
                }
                Boolean is_older = i_line.charAt(index + 1) != 'S';
                first_name = i_line.substring(0, index);
                index++;
                while(i_line.charAt(index) != ' '){
                    index++;
                }
                second_name = i_line.substring(index + 1);
                FamGen person = new FamGen();
                person.name = first_name;
                famgen_list.add(person);
                System.out.println(second_name);
            }
            //for (int i = 0; i < famgen_list.size(); i++){
                //FamGen lel = famgen_list.get(i);
                //System.out.println(lel.name);
            //}
            myScanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class FamGen{
    public String name;
    public int generation;
    void SetName(String n){
        name = n;
    }
    void SetGen(int n){
        generation = n;
    }
}