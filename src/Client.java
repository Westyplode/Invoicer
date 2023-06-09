public class Client {

    private String name;
    private int uniqueID;
    private int hourlyRate;
    private int hours;
    private int totalCost;

    public Client(int uniqueID, String name, int hourlyRate, int hours) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.totalCost = hours * hourlyRate;
    }
    public Client(String record) {
        // construct from a comma-separated string containing all fields
        String[] fields = record.split(",");
        uniqueID = Integer.parseInt(fields[0]);
        name = fields[1];
        hourlyRate = Integer.parseInt(fields[2]);
        hours = Integer.parseInt(fields[3]);
        totalCost = Integer.parseInt(fields[3]);
    }


    public String getName() {
        return name;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public String toString() {
        // printable string representation
        String representation =
                Integer.toString(uniqueID) + "," +  name + "," +
                        Integer.toString(hourlyRate) + "," +
                Integer.toString(hours) + "," + Integer.toString(totalCost);
        return representation;
    }
    public void display() {
        // print fields to console
        System.out.println(toString());
    }

}