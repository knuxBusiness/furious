public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
    }

    // public static int gcd(int a, int b) {
    // if (a == 0)
    // return b;
    // if (b == 0)
    // return a;
    // if (a > b)
    // return gcd(a - b, b);
    // return gcd(a, b - a);
    // }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if (a < 0 || b < 0) {
            return -1;
        }
        return gcd(b, a % b);
    }
}