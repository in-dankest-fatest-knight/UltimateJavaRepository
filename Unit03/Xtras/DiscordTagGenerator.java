package Unit03.Xtras;

import java.util.Scanner;

public class DiscordTagGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("username: ");
        String name = s.nextLine();
        name += "#";
        name += (int)(Math.random() * 10000);
        System.out.println(name);
        s.close();
    }
}
// javac Unit03\Xtras\DiscordTagGenerator.java
// java Unit03.Xtras.DiscordTagGenerator