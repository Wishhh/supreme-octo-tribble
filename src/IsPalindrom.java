//1.     დაწერეთ ფუნქცია რომელსაც გადაემეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
// (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან)
import java.util.*;
class IsPalindrom {

    static void isPalindrome(String text){
        StringBuilder reverse= new StringBuilder();
        for (int i=text.length()-1; i>=0; i--) reverse.append(text.charAt(i));
        System.out.print(text.equals(reverse.toString()));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String text = input.nextLine();
        isPalindrome(text);
    }

}
