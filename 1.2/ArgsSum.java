public class ArgsSum {

    public static void main(String[] args) {
        int n = args.length;
        int i = 0;
        int sum = 0;

        while (i < n) {
            sum = sum + Integer.parseInt(args[i]);
            i = i + 1;
        }
        System.out.println(sum);
    }

}
