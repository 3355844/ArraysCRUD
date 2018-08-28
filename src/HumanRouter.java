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

        redactor.readHumans(sortHumansById(humans));
    }

    public Human[] sortHumansById(Human[] humans) {

        Human[] tmpHumans = new Human[humans.length];
        int count = 0;
        Human human;

        for (int i = 0; i < humans.length; i++) {
            if (humans[i] != null) {
                tmpHumans[count] = humans[i];
                count++;
            }
        }

        for (int i = 1; i < tmpHumans.length; i++) {
            if (tmpHumans[i] != null) {
                human = tmpHumans[i];
                Human tmpHuman = tmpHumans[i - 1];
                while (human.getId() < tmpHuman.getId()) {
                    tmpHumans[i - 1] = human;
                    tmpHumans[i] = tmpHuman;
                }
            }
        }
        humans = tmpHumans;
        return humans;
    }

    protected String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}
