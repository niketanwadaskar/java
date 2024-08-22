public class WindowPosSum {

    public static int[] winPosSum(int[] a, int n) {
        for (int j = 0; j < a.length; j++) {
            if (a[j] < 0)
                continue;
            for (int i = 1; i <= n && j + i < a.length; i++) {
                a[j] = a[j] + a[j + i];
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = { 1, 2, -3, 4, 5, 4 };
        int[] ans = winPosSum(a, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            System.out.print(" ");
        }
    }
}

/*
 * {4, 8, -3, 13, 9, 4} for n = 3
 * 
 */
