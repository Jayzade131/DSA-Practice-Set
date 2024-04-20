package Stack;

public class Main {
    public static void main(String[] args) throws Exception {
    CustomStack cs=new CustomStack(5);

        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.push(40);
        cs.push(50);

        System.out.println(cs.peek());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());





    }

}
