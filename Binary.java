public class Binary {
    public static void main(String[] args) {
        System.out.println(find(13));
    }

    public static int find(int n) {
        if (n < 2) {
            return 1;
        }
        return n % 2 + find(n / 2) * 10;
    }
}
