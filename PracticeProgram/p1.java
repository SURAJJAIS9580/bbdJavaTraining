import java.util.Scanner;
public class p1
{

    public static void main(String [] args)
    {

        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum = 0;
        for(int i=0;i<num;i++){

            System.out.print(i +" ");
            sum = sum+i;
        }
        System.out.println();
        System.out.println(sum);

        }

}