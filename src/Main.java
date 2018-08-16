public class Main {

    public static void main(String[] args) {

        String value = "name";
        String newValue = "newName";
        String[] arr = new String[10];
        Redactor redactor = new Redactor();

        arr = redactor.create(arr, value);
        redactor.read(arr);
        redactor.read(arr,0);

        redactor.create(arr, value);
        redactor.read(arr);

        redactor.update(arr, 1, newValue);
        redactor.read(arr);

        redactor.delete(arr, 0);
        redactor.read(arr);
    }
}
