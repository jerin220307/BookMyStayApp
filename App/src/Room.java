public class Room {
    int id;
    String type;
    boolean available;

    public Room(int id, String type) {
        this.id = id;
        this.type = type;
        this.available = true;
    }
}