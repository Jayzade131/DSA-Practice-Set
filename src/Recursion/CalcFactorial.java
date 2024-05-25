package Recursion;

public class CalcFactorial {

    public static void main(String[] args) {
        System.out.println(calculate(5));

    }

    public static int calculate(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }

      int cal_nm1=  calculate(n-1);
      int ans= n * cal_nm1;
      return ans;
    }
}
