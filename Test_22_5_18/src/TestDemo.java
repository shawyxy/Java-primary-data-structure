public class TestDemo {

    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        Print(array);
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] arr;

        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main1(String[] args) {
        int array1[] = {1,2,3,4};
        int array2[] = new int[]  {1,2,3,4};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
