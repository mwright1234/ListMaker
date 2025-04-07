import java.util.ArrayList;
import java.util.Scanner;
public class ListMaker {

    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        final String menuPrompt = "A - add D - Delete I - Insert P -Print - Q - Quit";
        boolean running = true;
        String item = "";
        String cmd = "";
        String quitYN = "";
        int userSelection;

        do {
            displayMenu();
            cmd = SafeInput.getRegExString(in, menuPrompt, "[aAdDiIpPqQ]");
            switch (cmd.toLowerCase()) {
                case "a":
                    String newItem = SafeInput.getNonZeroLenString(in, "Enter item to add:");
                    list.add(newItem);
                    System.out.println("Item added to the list.");
                    break;

                case "d":
                    if (list.isEmpty()) {
                        System.out.println("The list is empty. Nothing to delete.");
                        break;
                    }
                    printList();
                    int deleteIndex = SafeInput.getRangedInt(in, "Enter index to delete:", 1, list.size()) - 1;
                    String removedItem = list.remove(deleteIndex);
                    System.out.println("Item \"" + removedItem + "\" removed from position " + (deleteIndex + 1));
                    break;
                case "i":
                    if (list.isEmpty()) {
                        System.out.println("The list is empty. The item will be inserted at position 1.");
                    } else {
                        printList();
                    }
                    int insertIndex = SafeInput.getRangedInt(in, "Enter index to insert at:", 1, list.size() + 1) - 1;
                    String insertItem = SafeInput.getNonZeroLenString(in, "Enter item to insert:");
                    list.add(insertIndex, insertItem);
                    System.out.println("Item inserted at position " + (insertIndex + 1));
                    break;
                case "p":
                    printList();
                    break;
                case "q":
                    if (SafeInput.getYNConfirm(in, "Are you sure you want to quit?")) {
                        running = false;
                        System.out.println("Exiting ListMaker. Goodbye!");
                    }
                    break;
            }
        }while(running);



    }

    public static void displayMenu(){
        System.out.println("\n===== List Maker Menu =====");
        System.out.println("A - Add Item");
        System.out.println("D - Delete Item");
        System.out.println("I - Insert Item");
        System.out.println("P - Print List");
        System.out.println("Q - Quit");
        System.out.println("===========================\n");
    }

    public static void printList() {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("\n--- Current List ---");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%2d: %s%n", i + 1, list.get(i));
            }
            System.out.println("--------------------\n");
        }
    }
}






