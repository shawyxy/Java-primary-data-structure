import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        int[] array = new int[4];
        Arrays.fill(array, 9);
        System.out.println(Arrays.toString(array));
    }
    public static void main6(String[] args) {
        int[][] array = new int[][]{{1,2}, {2},{4,5,6}};

        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

    }
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main5(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int binarySearch(int[] arr, int k) {

        int left = 0;
        int right = arr.length-1;

        while(right >= left) {
            //每次循环更新mid
           int mid = (right + left) / 2;

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
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main2(String[] args) {
        int[] arr = {9, 5, 2, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr = {6,5,4,3,2,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        int[] arr = new int[]{1,2,3};
        int k = 1;
        int ret = binarySearch(arr, k);
        System.out.println(ret);
    }
}
