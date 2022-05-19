import java.util.Arrays;

public class TestDemo {

    public static int Findf(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double average(int[] arr) {
        double ret = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ret = (double)sum / (double)arr.length;
        return ret;
    }
    public static int find(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(k == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int k) {
        int mid = 0;
        int right = arr[0];
        int left = arr[arr.length-1];

        while(right <= left) {
            //每次循环更新mid
            mid = (right + left) / 2;

            if(k > arr[mid]) {
                //k在左边
                left = mid + 1;
            } else if (k < arr[mid]) {
                //k在右边
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int k = 1;
        int ret = find(arr, k);
        System.out.println(ret);
    }
    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3};

       int[] newArr =  Arrays.copyOfRange(arr,0,3);
        System.out.println(Arrays.toString(newArr));
    }

    public static void main4(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] newArr = new int[arr.length];
/*
        int[] newArr = Arrays.copyOf(arr,arr.length-1);
*/
        System.arraycopy(arr,1,newArr,1,arr.length-1);
        System.out.println(Arrays.toString(newArr));
    }
    public static String my_ArraytoString(int[] array) {
        String arr = "[";

        for (int i = 0; i < array.length; i++) {
            arr += array[i];
            if(i != array.length - 1) {
                arr += ",";
            }
        }

        arr += "]";
        return arr;
    }
    public static void main3(String[] args) {
        int[] arr = new int[]{1,2,3};

        String arr2str = my_ArraytoString(arr);

        System.out.println(arr2str);
    }
    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] doubleArray(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] * 2;
        }
        return arr;
    }
    public static void Tranform(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
    public static void main2(String[] args) {
        int[] arr = new int[]{1,2,3};

        int[] ret = doubleArray(arr);

        Print(ret);
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3};
        Print(array);
    }
}
