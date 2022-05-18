import java.util.Arrays;
public class TestDemo {

    public static String myToString(int[] array){
        if(array== null) {
            return null;
        }
        String str = "[";


            for (int i = 0; i < array.length; i++) {
               str += array[i];
               if(i != array.length - 1) {
                   str += ",";
               }
            }

        str += "]";
        return str;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println((myToString(array)));
    }
}
