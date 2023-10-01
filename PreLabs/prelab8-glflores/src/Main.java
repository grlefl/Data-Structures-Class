public class Main {

    static int frozen(int[] arr) {
        return frozen_helper(arr, arr.length);
    }

    static int frozen_helper(int[] arr, int n) {
        if (n <= 1) {
            return 1;
        }
        int s = 1;
        for (int i = 0; i < n; i++) {
            s *= arr[i];
        }
        System.out.println(s);
        return s + frozen_helper(arr, n-1);
    }

    public static void main(String[] args) {
        //int[] a = {1,2,3,4,5};
        int[] a = {0,1,2,3,4,5};
        System.out.println(frozen(a));
    }
}
