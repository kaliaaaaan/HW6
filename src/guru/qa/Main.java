package guru.qa;

public class Main {
    public static void main(String[] args) {

        // 1)
        int a = 10;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a - b + a + a / b * a + b = " + (a - b + a + a / b * a + b - a));

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("((a + 32) == 44 || (b - 5 == 6)) = " + ((a + 32) == 44 || (b - 5 == 6)));
        System.out.println("((a + 34) == 44 || (b - 5 == 6)) =" + ((a + 34) == 44 || (b - 5 == 6)));

        System.out.println("((a + 34) == 44 || (b - 5 == 6)) =" + ((a + 34) == 44 && (b - 5 == 1)));
        System.out.println("((a + 34) == 44 || (b - 5 == 6)) =" + ((a + 34) == 44 && (b - 5 == 5)));

        int maxint = Integer.MAX_VALUE;
        System.out.println(maxint + 1);

        // 2)

        int c = 2;
        double d = 5.81;

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c == d = " + (c != d));

    }

}