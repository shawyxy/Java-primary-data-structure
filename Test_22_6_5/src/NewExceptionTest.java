public class NewExceptionTest {
    public static double area(double a, double b, double c) throws NewException {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        try {
            System.err.println(area(2.0,2.0,2.0));
        } catch (NewException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}