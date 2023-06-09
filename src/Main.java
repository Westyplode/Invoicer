import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client Steve = new Client(1001, "Dave",  23, 50 );
        Steve.display();
        ClientList Money = new ClientList("Income.txt");
        Money.display();



    }
}
