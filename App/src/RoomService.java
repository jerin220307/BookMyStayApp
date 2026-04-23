import java.util.*;

public class RoomService {

    static Map<Integer, Room> rooms = new HashMap<>();

    static {
        rooms.put(1, new Room(1, "Single"));
        rooms.put(2, new Room(2, "Double"));
        rooms.put(3, new Room(3, "Suite"));
    }

    // Show all rooms
    public void displayAllRooms() {
        for (Room r : rooms.values()) {
            System.out.println(r.id + " " + r.type + " Available: " + r.available);
        }
    }

    // Show only available rooms
    public void displayAvailableRooms() {
        for (Room r : rooms.values()) {
            if (r.available) {
                System.out.println(r.id + " " + r.type);
            }
        }
    }

    // Search by room type
    public void searchByType(String type) {
        boolean found = false;
        for (Room r : rooms.values()) {
            if (r.type.equalsIgnoreCase(type)) {
                System.out.println("Found: " + r.id + " " + r.type + " Available: " + r.available);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No rooms found for type: " + type);
        }
    }
}