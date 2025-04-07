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
            switch (cmd) {
                case "A":
                case "a":

                case "D":
                case "d":

                case "I":
                case "i":

                case "P":
                case "p":

                case "Q":
                case "q":
            }
        }while(running);



    }

    public static void displayMenu(){

    }
}
