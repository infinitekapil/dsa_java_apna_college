public class Factorial {
    public static void factorial(int n,int m) {
        if(n<1){
            System.out.println(m);
            return;
        }
        m=m*n;
        factorial(n-1, m);
    }
    public static void main(String[] args) {
        int m=1,n=3;
        factorial(n, m);
    }
}
