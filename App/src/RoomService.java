import java.util.*;

public class RoomService {

    static Map<Integer, Room> rooms = new HashMap<>();

    static {
        rooms.put(1, new Room(1, "Single"));
        rooms.put(2, new Room(2, "Double"));
    }

    // 👇 ADD THIS METHOD
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