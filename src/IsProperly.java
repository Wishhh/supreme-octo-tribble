//4.     მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან.
// დაწერეთ ფუნქცია რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
import java.util.*;
public class IsProperly {

    static void isProperly(String sequence){
        int result = 0;
        String[] se = sequence.split("");
        for (int i=0; i<sequence.length(); i++){
            if (se[i].equals("(")) result++;
            else result--;
        }
        if (result == 0) System.out.println("სწორი მიმდევრობაა: " + sequence);
        else System.out.println("არასწორია " + sequence);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sequence: ");
        String sequence = input.nextLine();
        isProperly(sequence);
    }
}
