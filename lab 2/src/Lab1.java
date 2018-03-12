import java.io.*;
import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args)
    {
        System.out.println("3 points: ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextInt();
        double y1 = in.nextInt();
        double z1 = in.nextInt();
        double x2 = in.nextInt();
        double y2 = in.nextInt();
        double z2 = in.nextInt();
        double x3 = in.nextInt();
        double y3 = in.nextInt();
        double z3 = in.nextInt();


        Point3d P1 = new Point3d(x1, y1, z1);
        Point3d P2 = new Point3d(x2, y2, z2);
        Point3d P3 = new Point3d(x3, y3, z3);

        double answer = computeArea(P1, P2, P3);
        System.out.println("Answer is " +answer);

    }

    public static double computeArea (Point3d val1, Point3d val2, Point3d val3)
    {
        if (val1.equals(val2) || val2.equals(val3) || val3.equals(val1))
            System.out.print("Error");
        double a = val1.distanceTo(val1);
        double b = val3.distanceTo(val2);
        double c = val1.distanceTo(val3);
        double Area = (a + b + c) % 2;
        return Area;
    }


}
