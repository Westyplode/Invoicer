import java.io.File;
import java.util.ArrayList;

public class ClientList {

        private ArrayList<Client> allClients;
        private String databaseFileName;

        public ClientList(String filename) {
            databaseFileName = filename;
            allClients = new ArrayList<>();

            ArrayList<String> clientSheet = FileHandler.readWholeFile(filename);
            for (String record: clientSheet) {
                Client c = new Client(record);
                allClients.add(c);
            }
        }

        public void display() {
            for (Client c: allClients) {
                c.display();
            }
        }

        public void add(int uniqueID,String name, int hourlyRate, int hours) {
            // add a new dog to the kennels
            // new additions have a stayLength of 0, by definition
            allClients.add(new Client(uniqueID,name, hourlyRate, hours));
        }

        public void save() {
            // write out all the dogs records to a CSV file
            FileHandler.writeLine(databaseFileName, "Name,Age,Breed,Stay Length", false);
            for (Client c: allClients) {
                FileHandler.writeLine(databaseFileName, c.toString(), true);
            }
        }

}
