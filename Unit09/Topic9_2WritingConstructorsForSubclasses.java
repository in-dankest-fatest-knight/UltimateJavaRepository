package Unit09;

public class Topic9_2WritingConstructorsForSubclasses {
    public static void main(String[] args) {
        double x = 0.0;
    
        for (int i = 0; i < 10; i++) {
            x += 0.1;
        }

        System.out.println("x = " + x);
        System.out.println(x == 1.0);
    }
}
