import java.util.Scanner;

public class main4 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int grade, sum = 0;
        double avg;
        int aa = 0;
        System.out.println("Enter number of test" );
        aa = in.nextInt();
        if (aa != 0){
        for (int i = 1 ; i <= aa ;i++){
            System.out.println("Enter grade number" + i + ".");
            grade = in.nextInt();
            System.out.println("Grade entered successfuly! " + grade);
            sum += grade;
        }

        avg = (double)sum / aa;
        System.out.println("You final averagee is:" + avg);
        }







        in.close();
    }
}

