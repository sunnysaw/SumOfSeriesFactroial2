/*
Question : Java Program to Find the Sum of the Series 1/1+1/4+1/9+…1/N^2
_____________________________________________________________________________
Case 1 (Simple Test Case) :
Enter the number of terms in the series
34
The sum is 1.6159505883765848
 */
import java.util.Scanner;
public class Main {
    double square(double digit){
        double sum = 0,temp = 1;
        while (digit > 0){
            sum = temp * temp;
            digit--;
            temp++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 1,sum = 0,digit,temp2 = 1;
        Main obj = new Main();
        System.out.println("Enter the number for finding the sum of series :");
        digit = sc.nextDouble();
        while (temp <= digit){
            sum += temp2 / obj.square(temp);
            temp++;
        }
        System.out.println("Printing the result : " + sum);
    }
}