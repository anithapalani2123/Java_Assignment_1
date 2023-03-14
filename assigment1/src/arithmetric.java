import java.util.Scanner;
public class arithmetric {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int add,sub,multi,div,rem;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        add=num1+num2;
        sub=num1-num2;
        multi=num1*num2;
        div=num1/num2;
        rem=num1%num2;
        System.out.println("Addition:"+add+"\nsubtraction:"+sub+"\nMultiplication:"+multi+"\nDivision"+div+"\nRemainder:"+rem);

    }
}
