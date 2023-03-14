import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        int num1,num2;
        int add,sub,multi,div;

        Scanner sc=new Scanner((System.in));
        System.out.print("Enter the First Number:");
        num1=sc.nextInt();
        System.out.print("Enter the Second Number:");
        num2=sc.nextInt();
        int op;
        System.out.println("option 1: ADDITION\noption 2: SUBTRACTION\noption 3: MULTIPLICATION\noption 4: DIVISION\nEnter the option number:");
        op=sc.nextInt();
        switch(op)
        {
            case 1:
                add=num1+num2;
                System.out.println("Addition of two Number: "+add);
                break;
            case 2:
                sub=num1-num2;
                System.out.println("Subtraction of two number: "+sub);
                break;
            case 3:
                multi=num1*num2;
                System.out.println("Multipication of Two Number: "+multi);
                break;
            case 4:
                div=num1/num2;
                System.out.println("Division iof Two number: "+div);
                break;
            default:
                System.out.println("Enter the only  the option number");

        }



    }
}
