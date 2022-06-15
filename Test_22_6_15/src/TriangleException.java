import java.util.Scanner;
public class TriangleException extends Exception{
    public TriangleException(double a, double b, double c){
        System.out.println("不符合三角形");
        System.out.println("a="+a+",b+"+b+",c+"+c);
    }
}

class TriangleExceptionTest{
    public static double showArea (double a, double b, double c)throws  TriangleException{
        if(a+b<c || a+c<b || b+c<a){
            throw new TriangleException(a, b, c);
        }
        double p = (a+b+c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args){
        double a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();


        try{

            System.out.println(showArea(a, b, c));
        }catch(TriangleException e){
            System.out.println(e);
        }
    }
}