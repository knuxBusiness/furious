public class SumOfDigits {
    public static void main(String[] args) {
        int res = find(212);
        System.out.println(res);
    }

    public static int find(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + find(n / 10);
    }
}