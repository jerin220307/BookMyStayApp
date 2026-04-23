import java.util.*;

public class RoomService {

    // Room storage
    static Map<Integer, Room> rooms = new HashMap<>();

    // Initial rooms
    static {
        rooms.put(1, new Room(1, "Single"));
        rooms.put(2, new Room(2, "Double"));
        rooms.put(3, new Room(3, "Suite"));
    }

    // ✅ UC9: Validation
    public boolean validateBooking(String name, int roomId) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name");
            return false;
        }

        if (!rooms.containsKey(roomId)) {
            System.out.println("Invalid room ID");
            return false;
        }

        return true;
    }

    // ✅ UC6: Allocation
    public void allocateRoom(Booking booking) {

        Room room = rooms.get(booking.roomId);

        if (room == null) {
            System.out.println("Invalid Room ID");
            return;
        }

        if (!room.available) {
            System.out.println("Room already booked");
            return;
        }

        room.available = false;

        System.out.println("Booking Confirmed for " + booking.name);
    }
}