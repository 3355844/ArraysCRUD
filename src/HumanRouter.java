import java.util.Scanner;

public class HumanRouter {

//    Menu menu = new Menu();
    HumanRedactor redactor = new HumanRedactor();

    public Human[] addHumanRouting(Human[] humans) {
        Human tmpHuman = new Human();

        System.out.println("Enter Data for new Human");
        System.out.println("Name:");
        tmpHuman.setName(readConsoleValue());
        System.out.println("LastName: ");
        tmpHuman.setLastName(readConsoleValue());
        System.out.println("Age: ");
        tmpHuman.setAge(Integer.parseInt(readConsoleValue()));
        return redactor.addHuman(humans, tmpHuman);
    }

    public Human[] updateHumanRouting(Human[] humans) {
        Human human;
        System.out.println("Please enter Data for update Human:");
        System.out.println("Enter ID for update:");
        human = redactor.findById(humans, Integer.parseInt(readConsoleValue()));
        System.out.println("Enter new Name:");
        human.setName(readConsoleValue());
        System.out.println("Enter new LastName:");
        human.setLastName(readConsoleValue());
        System.out.println("Enter new Age");
        human.setAge(Integer.parseInt(readConsoleValue()));

        return redactor.updateHuman(humans, human);
    }

    public Human[] deleteHumanRouting(Human[] humans) {
        int id;

        System.out.println("Please enter data for delete Human:");
        System.out.println("Enter ID for delete:");
        id = Integer.parseInt(readConsoleValue());
        if (redactor.findById(humans, id) != null) {
             redactor.deleteHuman(humans, id);
        }

        return humans;
    }

    public void readHumansRouting(Human[] humans) {
        redactor.readHumans(humans);
    }

    protected String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}
