package OtherQuestion;

public class SubtractProductAndSum {

    public static void main(String[] args) {
       int n = 234;
        System.out.println(  subtractProductAndSum(n));
    }
    static int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while(n>0)
        {
           int num= n%10;
            System.out.println(num);
           sum=sum+num;

           mul=mul*num;

           n=n/10;
        }
        int sub=mul-sum;

        return  sub;
    }
}
