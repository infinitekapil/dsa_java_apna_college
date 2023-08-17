public class Sum_natural {
    public static void sumNatural(int n,int sum) {
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum = sum+n;
        sumNatural(n-1, sum);
    }
    public static void main(String[] args) {
        int n=5,sum=0;
        sumNatural(n, sum);
    }
}
