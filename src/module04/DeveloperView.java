package module04;

import java.util.Scanner;

/**
 * Created by tetya on 12.07.2017.
 * Класс DeveloperView - который содержит логику работы с консолью
 * Menu
 */
public class DeveloperView {
    //private static final int SHOW_ALL_DEV = 1;
    private static final int CREATE_NEW= 2;
    private static final int EDIT_DEV = 3;
    private static final int SHOW_DEV = 4;
    private static final int DELETE_DEV = 5;
    private static final int EXIT_ITEM = 0;

    private DeveloperController developerController;
    private Scanner scan;

    public DeveloperView(DeveloperController developerController) {
        this.developerController = developerController;
        scan = new Scanner(System.in);
    }
    public DeveloperView(){
        scan = new Scanner(System.in);
    }

    private int getInput() {
        int res = -1;
        String inputStr = scan.nextLine();
        try {
            res = Integer.parseInt(inputStr);
        } catch (NumberFormatException nfe) {
            System.out.println("String " + inputStr + " is not a number");
        }
        return res;
    }

    private Integer scanIntWithRetry(String ageMsg) {
        Integer sum = null;
        String ageStr;
        do {
            System.out.println(ageMsg);
            ageStr = scan.nextLine();
            try {
                sum = Integer.valueOf(ageStr);
            } catch (NumberFormatException nfe) {
                System.out.println("Not an int value, input again");
            }
        } while (sum == null);

        return sum;
    }

    //главное меню
    public void main() {
        int choise = EXIT_ITEM;

        do {
            showMenu();
            choise = getInput();

            switch (choise) {
                case EXIT_ITEM:
                    System.exit(0);
                    break;
                //case SHOW_ALL_DEV:
                //    showAllDevelopers();
                //    break;
                case CREATE_NEW:
                    addNewDeveloper();
                    break;
                case EDIT_DEV:
                    editDeveloper();
                    break;
                case SHOW_DEV:
                    showDeveloper();
                    break;
                case DELETE_DEV:
                    delDeveloper();
                    break;
            }
        } while (choise != EXIT_ITEM);
    }
    //=========================================
    private void showAllDevelopers() {
        for (Developer d : developerController.showAll()) {
            System.out.println(d);
        }
    }

    private void addNewDeveloper() {
        System.out.println("Enter developer's name:");
        String nameD = scan.nextLine();
        System.out.println("Enter developer's age:");
        Integer ageD = scanIntWithRetry(scan.nextLine());
        System.out.println("Developer's qualification:");
        String qualD = scan.nextLine();
        System.out.println("Enter developer's experiance:");
        String experD = scan.nextLine();

        Developer dev = new Developer(nameD, ageD, qualD, experD);
        developerController.addDev(dev);
    }

    private void showDeveloper() {
        //System.out.println("Enter developer's ID:");
        Long iD = Long.valueOf(0);//(scan.nextLine());
        Developer d = developerController.showDev(iD);
        if (d == null){
            System.out.println("EMPTY");
        } else
            System.out.println(developerController.showDev(iD).toString());
    }

    private void delDeveloper() {
        //System.out.println("Enter developer's ID:");
        Long iD = Long.valueOf(0);//Long.valueOf(scan.nextLine());
        developerController.delDev(iD);
    }

    private void editDeveloper() {
        //System.out.println("Enter developer's ID:");
        Long iD = Long.valueOf(0);//Long.valueOf(scan.nextLine());

        System.out.println("Enter developer's name:");
        String nameD = scan.nextLine();
        System.out.println("Enter developer's age:");
        Integer ageD = scanIntWithRetry(scan.nextLine());
        System.out.println("Developer's qualification:");
        String qualD = scan.nextLine();
        System.out.println("Enter developer's experiance:");
        String experD = scan.nextLine();
        Developer dev = new Developer(nameD, ageD, qualD, experD);
        dev.setId(iD);

        developerController.editDev(dev);

    }

    public void showMenu() {
        System.out.println("-----------------");
        //System.out.println("1. Show all developers");
        System.out.println("2. Create developer");
        System.out.println("3. Edit developer");
        System.out.println("4. Show developer");
        System.out.println("5. Delete developer");
        System.out.println("0. Выход");
    }
}
