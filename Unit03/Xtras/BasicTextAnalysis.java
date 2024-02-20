package Unit03.Xtras;

import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word1 = "";
        String sen1 = "";
        int chars = 0;
        s.useDelimiter("\\Z");

        boolean active = true;
        String chunk = s.next();
        System.out.println("you typed in " + chunk);
        // while(active){

        // }
    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
