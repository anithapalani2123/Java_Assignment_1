import java.util.Scanner;
public class area_rhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p,q;
        p=sc.nextInt();
        q=sc.nextInt();
        int area=(p*q)/2;
        System.out.println("Area of a Rhombus is "+area);
    }
}
