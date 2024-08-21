public class Array {
    public static void main(String[] args) {
        int [] m =  {1,2,3,4,5,6};
        int[] numbers = new int [10];
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}
