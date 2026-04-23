import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RoomService rs = new RoomService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter room id:");
        int roomId = sc.nextInt();

        Booking booking = new Booking(name, roomId);

        if (rs.validateBooking(name, roomId)) {
            rs.allocateRoom(booking);
        }
    }
}