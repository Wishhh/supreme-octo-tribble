//2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია,
// რომელსაც გადაეცემა თანხა (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას,
// რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
import java.util.*;
class MinSplit {

    static void minSplit(int amout){
        int result = 0;
        int[] coins = new int[]{1, 5, 10, 20, 50};
        Arrays.sort(coins);
        int i=coins.length-1;
        while (i>=0) {
            if (amout / coins[i] > 0) {
                result += amout / coins[i];
                amout -= (amout / coins[i]) * coins[i];
            }
            i--;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coinsvalue: ");
        int amout = input.nextInt();
        minSplit(amout);
    }

}
