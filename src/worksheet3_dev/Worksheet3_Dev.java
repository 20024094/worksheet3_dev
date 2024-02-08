package worksheet3_dev;

/**
 *
 * @author 20024094
 */
import javax.swing.*;
import java.util.ArrayList;

public class Worksheet3_Dev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int menu_choice = 0;
        String output = "";
        output += "\nMENU";
        output += "\n1 = Print Names";
        output += "\n2 = Add Guest";
        output += "\n3 = Remove Guest";
        output += "\n4 = Check if guest is on list";
        output += "\n5 = Check how many guests";
        do {
            menu_choice
                    = Integer.parseInt(JOptionPane.showInputDialog(output
                            + "\nPlease enter your choice."));
        } while (menu_choice < 0 || menu_choice > 5);
        decision(menu_choice);
    }
    
    public static void resultFunction() {
        new Result();
    }
    
    public static void AddGuestFunction() {
        new AddResult();
    }

    public static void decision(int choice) {
        switch (choice) {
            case 1:
                PrintNames();
                resultFunction();
                break;
            case 2:
                AddGuest();
                AddGuestFunction();
                break;
            case 3:
                RemoveGuest();
                break;
            case 4:
                CheckGuest();
                break;
            case 5:
                TotalGuests();
                break;
        }
        menu();
    }

    public static void PrintNames() {
        System.out.print("Print Names");
    }

    public static void AddGuest() {
        System.out.print("Add Guest");
    }

    public static void RemoveGuest() {
        System.out.print("Remove Guest");
    }

    public static void CheckGuest() {
        System.out.print("Check Guest");
    }

    public static void TotalGuests() {
        System.out.print("Check Guest");
    }
}
