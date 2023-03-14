import java.util.Scanner;
public class tables {
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        int i;
        int num;
        int result;
        System.out.println("Enter the table number:");
        num=sc.nextInt();
        for(i=1;i<=12;i++)
        {
            result=num*i;
            System.out.println(num+"x"+i+"="+result);

        }
    }
}
