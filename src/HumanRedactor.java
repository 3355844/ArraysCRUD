public class HumanRedactor  {

    public Human[] addHuman (Human[] arr, Human human){
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==null){
                arr[i] = human;
                return arr;
            }
        }
        return arr;
    }

}
