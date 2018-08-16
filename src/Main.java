public class Main {

    public static void main(String[] args) {

        String value = "name";
        String newValue = "newName";
        String[] arr = new String[10];
        Redactor redactor = new Redactor();

        Menu menu = new Menu();

        menu.mainMenu();
        value = menu.readConsoleValue();
        System.out.println(value);

    }
}
