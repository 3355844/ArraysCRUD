import java.util.Scanner;

public class Menu {

    Redactor redactor = new Redactor();

    public void mainMenu(){
        System.out.println("MENU: \n" +
                "please enter command for action \n" +
                "c - create \n" +
                "r - read \n" +
                "u - update \n" +
                "d - delete \n" +
                "exit - for finish program");
    }

    public String[] createElement(String[] arr){
        System.out.println("Please enter value for element:");
        String value = readConsoleValue();
        arr = redactor.create(arr, value);
        redactor.read(arr);
        return arr ;
    }

    public String readConsoleValue(){
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }

}
