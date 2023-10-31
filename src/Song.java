import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Song {


    public void printSong(PrintStream out) {



        for (int day = 1; day <= 12; day++) {

            out.print("On the ");
            out.print(day);

            switch (day) {
                case 1 ->  out.print("st");
                case 2 ->  out.print("nd");
                case 3 ->  out.print("rd");
                default -> out.print("th");
            }

            out.println(" day of Christmas my true love gave to me");

            switch (day) {
                case 12: out.println("Twelve drummers drumming,");
                case 11: out.println("Eleven pipers piping,");
                case 10: out.println("Ten lords a leaping,");
                case 9:  out.println("Nine ladies dancing,");
                case 8:  out.println("Eight maids a milking,");
                case 7:  out.println("Seven swans a swimming,");
                case 6:  out.println("Six geese a laying,");
                case 5:  out.println("Five golden rings,");
                case 4:  out.println("Four calling birds,");
                case 3:  out.println("Three French hens,");
                case 2:  out.println("Two turtle doves, and");
                default: out.println("A partridge in a pear tree.");
            }

            out.println();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        //der skal lave en throw exception eller en try catch
        PrintStream output = new PrintStream("sangtekst.txt");
        Song song = new Song();
        System.out.println("Sang udskrives til tekstfilen og sangskrives txt");
        song.printSong(output);
        System.out.println("Nu er sangen skrevet ");
    }
}
