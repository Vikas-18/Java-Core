package Math;

public class Seive {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(isPrime(num));
        printPrimeTillNum(num);
    }
    public static boolean isPrime(int num)
    {

        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0 && num!=i)
            {
                return false;
            }
        }
        return true;
    }
    public static void printPrimeTillNum(int n) {
        boolean[] vis = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (!vis[i]) { // i is prime
                for (int j = i * i; j <= n; j += i) {
                    vis[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!vis[i]) {
                System.out.println(i);
            }
        }
    }





}
