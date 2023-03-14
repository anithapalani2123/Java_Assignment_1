import java.util.Scanner;
public class no_of_days_in_a_month {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int mon;
        System.out.print("Enter a month Number:");
        mon=sc.nextInt();
        switch(mon)
        {
            case 1:
                System.out.println("31 Days");
                break;

            case 2:
                System.out.println("28 Days");
                break;
            case 3:
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("30 Days");
                break;
            case 5:
                System.out.println("31 Days");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 10:
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("30 Days");
                break;
            case 12:
                System.out.println("31 Days");
                break;
        }


    }
}
