public class Main {

    public static void main(String[] args) {

        String[] arr = new String[10];
        Menu menu = new Menu();

        Human human = new Human();
        Human human1 = new Human(10);
        Human human2 = new Human(1, "name", "lastName", 30);

        System.out.println(human.toString());
        System.out.println(human1.toString());
        System.out.println(human2.toString());


//        while (!menu.theEndProgram){
//            menu.mainMenu();
//            arr = menu.route(arr);
//        }
    }
}
