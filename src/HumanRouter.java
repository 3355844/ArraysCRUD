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

    public Human[] updateHumanRouting(Human[] humans) {
        Human human;

        System.out.println("Please enter Data for update Human:");
        System.out.println("Enter ID for update:");
        human = redactor.findById(humans, Integer.parseInt(menu.readConsoleValue()));
        System.out.println("Enter new Name:");
        human.setName(menu.readConsoleValue());
        System.out.println("Enter new LastName:");
        human.setLastName(menu.readConsoleValue());
        System.out.println("Enter new Age");
        human.setAge(Integer.parseInt(menu.readConsoleValue()));

        return redactor.updateHuman(humans, human);
    }


    public void readHumansRouting(Human[] humans) {
        redactor.readHumans(humans);
    }

}
