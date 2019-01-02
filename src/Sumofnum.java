import java.util.Scanner;

public class Sumofnum {

    public static void main(String [] args){
         int GRADE_MINIMUM = 0;
        int GRADE_MAXIMUM = 100;
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numbofStudens = in.nextInt();
        int[] grades = new int[numbofStudens];
        int i = 0;
        while (i < numbofStudens)
        {
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();
            if (GRADE_MINIMUM <= grade && grade <= GRADE_MAXIMUM)
            {
                grades[i] = grade;
                i++;
            }
            else {
                System.out.println("Error! Grade must be integer between 0 and 100!");
            }
        }
      for( i=0;i<numbofStudens;i++){
          sum += grades[i];


      }
        System.out.println(sum);
    }


    }



