public class Power {
    public static void main(String[] args) {
        System.out.println(find(6, 0));
    }

    public static int find(int x, int n) {
        if(n<=0){
            return -1;
        }
        if (n == 1) {
            return x;
        }
        return x * find(x, n - 1);
    }
}
