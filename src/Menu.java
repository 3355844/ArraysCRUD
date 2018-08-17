import java.util.Scanner;

public class Menu {

    Redactor redactor = new Redactor();

    public void mainMenu() {
        System.out.println("MENU: \n" +
                "please enter command for action \n" +
                "c - create \n" +
                "r - read \n" +
                "u - update \n" +
                "d - delete \n" +
                "exit - for finish program");
    }

    public boolean route(String[] arr) {

        boolean theEndProgram = false;
        String command = readConsoleValue();

        if (command.equalsIgnoreCase("c")) {
            createElement(arr);
        } else if (command.equalsIgnoreCase("r")) {
            readElement(arr);
        } else if (command.equalsIgnoreCase("u")) {
            updateElement(arr);
        } else if (command.equalsIgnoreCase("d")) {
            deleteElement(arr);
        } else if (command.equalsIgnoreCase("exit")) {
            System.out.println("You exit from program: ");
            theEndProgram = true;
        } else {
            System.out.println("Incorrect command try again : ");
        }

        return !theEndProgram;
    }


    public String[] createElement(String[] arr) {
        System.out.println("Please enter value for create element:");
        String value = readConsoleValue();
        arr = redactor.create(arr, value);
        return arr;
    }

    public String[] updateElement(String[] arr) {
        String value;
        int index;

        System.out.println("Please enter new value for update element: ");
        value = readConsoleValue();
        System.out.println("Please enter index(only numbers): ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.update(arr, index, value);
        return arr;
    }

    public String[] deleteElement(String[] arr) {
        int index;

        System.out.println("Please enter index for delete element (only numbers): ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.delete(arr, index);
        return arr;
    }

    public void readElement(String[] arr) {
        redactor.read(arr);
    }

    public String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

}
