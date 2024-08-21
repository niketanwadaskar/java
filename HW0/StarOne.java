public class StarOne {
    public static  void drawTriangle(int args) {
        for (int j = 0; j <= args; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int argumentFromCommandLine = Integer.parseInt(args[0]);
        drawTriangle(argumentFromCommandLine);
    }
}