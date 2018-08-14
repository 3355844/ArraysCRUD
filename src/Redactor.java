public class Redactor {

    public String[] create(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return arr;
            }
        }
        return arr;
    }

    public void read(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }

    public void read(String[] arr, int index) {
        if (index > arr.length - 1) {
            System.out.println("No such index!!!");
        } else {
            System.out.println("Value: " + arr[index]);
        }
    }

    public String[] update(String[] arr) {

        return arr;
    }

    public String[] delete(String[] arr) {

        return arr;
    }
}
