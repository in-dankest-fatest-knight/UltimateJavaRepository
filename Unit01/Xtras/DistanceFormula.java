package Unit01.Xtras;

public class DistanceFormula {

    public static double dist(double x1, double y1, double x2, double y2){
        return (Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
    }
     
    public static void main(String[] args) {

        System.out.print(dist(0, 0, 1, 1));

    }
}
