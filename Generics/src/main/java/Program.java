
public class Program {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("Bye");
        list.add("Marsel");

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
