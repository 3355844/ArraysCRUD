public class Main {

    public static void main(String[] args) {

        String[] arr = new String[10];
        Menu menu = new Menu();

        menu.mainMenu();
        arr = menu.createElement(arr);
        menu.readElement(arr);
        arr = menu.updateElement(arr);
        menu.readElement(arr);
        arr = menu.deleteElement(arr);
        menu.readElement(arr);
    }
}
