public class Main {

    public static void main(String[] args) {

        String[] arr = new String[10];
        Menu menu = new Menu();

        menu.mainMenu();
        arr = menu.createElement(arr);
        System.out.println(arr[0]);
    }
}
