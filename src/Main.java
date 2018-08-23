public class Main {

    public static void main(String[] args) {

        Human[] humans = new Human[10];
        Menu menu = new Menu();
        HumanRouter router = new HumanRouter();
        humans = router.addHumanRouting(humans);
        router.readHumansRouting(humans);

//        while (!menu.theEndProgram){
//            menu.mainMenu();
//            arr = menu.route(arr);
//        }
    }
}
