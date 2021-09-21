import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double d1,d2,sum;
        System.out.println("Enter the 1 st number.");
        d1 = in.nextDouble();
        System.out.println("Enter the 2 nd number.");
        d2 = in.nextDouble();
        sum = d1 + d2;
        System.out.println("The sum is:" + sum);
    }
}
