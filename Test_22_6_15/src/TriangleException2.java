import java.util.Scanner;
public class TriangleException2 extends Exception{
    TriangleException2(double a, double b, double c){
        System.out.println("不符合三角形");
        System.out.println("abc");
    }
}
class TriangleTest{
    public static double showArea1(double a, double b, double c) throws TriangleException2{
        double p = 0;
        if(a+b<c||a+c<b||b+c<a) {
            throw new TriangleException2(a, b, c);
        } else {
            p = (a+b+c)/2;
        }
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        try{
            System.out.println(showArea1(a, b, c));
        }catch (TriangleException2 e){
            System.out.println(e);
        }
    }
}
