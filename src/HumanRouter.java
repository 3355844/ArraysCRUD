public class HumanRouter {

    Menu menu = new Menu();
    HumanRedactor redactor = new HumanRedactor();

    public Human[] addHumanRouting(Human[] humans) {
        Human tmpHuman = new Human();

        System.out.println("Enter Data for new Human");
        System.out.println("Name:");
        tmpHuman.setName(menu.readConsoleValue());
        System.out.println("LastName: ");
        tmpHuman.setLastName(menu.readConsoleValue());
        System.out.println("Age: ");
        tmpHuman.setAge(Integer.parseInt(menu.readConsoleValue()));
        return redactor.addHuman(humans, tmpHuman);
    }

    public void readHumansRouting(Human [] humans){
        redactor.readHumans(humans);
    }

}
