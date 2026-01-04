package Math;

public class BinaryExponentiation {
    public static void main(String[] args) {
        System.out.println(solve(3,15));
    }
    public static int solve(int a,int b)
    {
        //normal maths formula we are using
        // when the power of b is even we can have ans as b/2
        //when the power of the b is odd then a*(a^b/2)^2
        if(b==0)
        {
            return 1;
        }

        int halfPower = solve(a,b/2);
        int result = halfPower*halfPower;

        if(b%2==1)
        {
            result = result*a;
        }
        return result;
    }

}
