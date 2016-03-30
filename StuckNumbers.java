import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }
        boolean flag = false;
        for (int i1 = 0; i1 < numbers.length; i1++) {
            for (int i2 = 0; i2 < numbers.length; i2++) {
                for (int i3 = 0; i3 < numbers.length; i3++) {
                    for (int i4 = 0; i4 < numbers.length; i4++) {
                        int a = numbers[i1];
                        int b = numbers[i2];
                        int c = numbers[i3];
                        int d = numbers[i4];
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            String firs = "" + a + b;
                            String second = "" + c + d;
                            if (firs.equals(second)) {
                                System.out.printf("%d|%d==%d|%d\n", a, b, c, d);
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("No");
        }
    }
}
