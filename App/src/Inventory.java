import java.util.*;

public class Inventory {
    static Map<Integer, Room> rooms = new HashMap<>();

    static {
        rooms.put(1, new Room(1, "Single"));
        rooms.put(2, new Room(2, "Double"));
        rooms.put(3, new Room(3, "Suite"));
    }
}