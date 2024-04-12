package Recursion;

public class FindFIboOfNum {
    public static void main(String[] args) {
        int ans=fibo(4);
        System.out.println(ans);
    }

    static public int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
