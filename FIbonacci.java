public class FIbonacci {
    public static void main(String[] args) {
        System.out.println(find(5));
    }

    public static int find(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return find(n - 1) + find(n - 2);
    }
}
