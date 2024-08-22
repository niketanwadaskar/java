public class MaximumOutOfArray {

    public static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        // int [] arr = {1,2,3,4,5,5,22,2,32,32,33,322};
        int arr [] ={};
        System.out.println(max(arr));
    }

}
