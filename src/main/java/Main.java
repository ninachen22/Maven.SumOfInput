import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //invoking the method/calling the method
        int sum = sumOfNumbers(n);
        System.out.println("The sum is: " + sum);

    }

    static int sumOfNumbers(int n) { //method that takes int n from scanner above
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
//            System.out.println(sum);
        }
        return sum;
    }


    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return 0;
    }

    // for Extra extra credit - compare the methods and show which one is faster

}
