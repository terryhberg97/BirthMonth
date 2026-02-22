//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class BirthMonth {
    void main() {
        Scanner in = new Scanner(System.in);

        int birthMonth;
        String trash = "";

        System.out.println("Enter your birth month (1-12): ");
        birthMonth = in.nextInt();

        if (birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
                System.out.println("You entered an incorrected month value: " + birthMonth);
            }


            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.

        }
    }

