import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalsub=5;
        int totalmarks=0;

        for (int i = 1; i <= totalsub; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalmarks += marks;
        }
        
        double percentage = totalmarks / (double)(totalsub * 100) * 100;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 75)
            System.out.println("Grade: B");
        else if (percentage >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    
}
