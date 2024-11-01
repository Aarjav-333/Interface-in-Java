import java.util.*;
interface area
{
    final static double pi = 3.1417;
    double compute(double x, double y);
}
class triangle implements area {
    public double compute(double x, double y) {
        return 0.5 * x * y;
    }
}
class demo {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        area ar = new triangle();
        area at = new triangle();
        System.out.println("Rectangle");
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter breadth");
        double b = sc.nextInt();
        System.out.println("Triangle");
        System.out.println("Enter height");
        double h = sc.nextDouble();
        System.out.println("Enter the base");
        double ba = sc.nextDouble();
        System.out.println("Area of rectangle" + ar.compute(l,b));
        System.out.println("Area of triangle" + at.compute(h,ba));
        
    }
}
