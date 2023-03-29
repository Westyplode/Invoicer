public class Node {
    private String name;
    private Node next;

    public Node(String n) {
        name = n;
        next = null;
    }
    public Node getNext() {
        return next;
    }
    public String getName() {
        return name;
    }
    public void setNext(Node n) {
        next = n;
    }
    public void setValue(String n) {
        name = n;
    }
    public void display() {
        System.out.println(name);
    }
}

