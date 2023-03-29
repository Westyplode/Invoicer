import java.util.ArrayList;
import java.util.Arrays;
public class Client {
    public String list;

    public Client(String[] names) {
        list =
    }
    public void ClientList(String name) {
        list = name;

    }
    public String addClient(String[] names, String name) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(names));
        arrayList.add(name);
        names = arrayList.toArray(names);
        System.out.println("Array after adding element: "+Arrays.toString(names));
    }

}
