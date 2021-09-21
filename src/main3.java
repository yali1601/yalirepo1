import java.util.Scanner;

public class main3 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Enter a number.");
        number = in.nextInt();

        if (number > 6){
            System.out.println(number + "is greater than 6");
        }else if (number == 6){
            System.out.println(number + "is equal 6");
        }else{
            System.out.println(number + "is smaller than 6");
        }

        in.close();
    }
}
