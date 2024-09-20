import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException
    {
        String line = "a{b(c]d}e";
        int lengthLine = line.length();
        String input;
        while(true){
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if(input.equals(""))
                break;

            BracketChecker bCh = new BracketChecker(input);
            bCh.check();
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}