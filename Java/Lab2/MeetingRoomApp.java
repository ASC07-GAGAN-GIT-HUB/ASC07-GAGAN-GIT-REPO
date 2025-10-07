import java.util.*;

class MeetingRoom {
    private String roomId;
    private int capacity;
    private int floorLocation;

    public MeetingRoom(String roomId, int capacity, int floorLocation) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floorLocation = floorLocation;
    }

    public String getRoomId() {
        return roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloorLocation() {
        return floorLocation;
    }

    @Override
    public String toString() {
        return "Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floorLocation;
    }
}

class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floorLocation, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floorLocation);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId;
    }
}

class Booking {
    private String employeeId;
    private String roomId;
    private String date;
    private String time;
    private int duration; // in minutes

    public Booking(String employeeId, String roomId, String date, String time, int duration) {
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                ", Room ID: " + roomId +
                ", Date: " + date +
                ", Time: " + time +
                ", Duration: " + duration + " mins";
    }
}

class BookingManager {
    private Map<String, List<Booking>> bookingRecords = new HashMap<>();

    public void addBooking(Booking booking) {
        bookingRecords
                .computeIfAbsent(booking.getDate(), k -> new ArrayList<>())
                .add(booking);
    }

    public List<Booking> getBookingsByDate(String date) {
        return bookingRecords.getOrDefault(date, new ArrayList<>());
    }
}

public class MeetingRoomApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookingManager manager = new BookingManager();

        MeetingRoom room1 = new MeetingRoom("MR101", 8, 1);
        ZoomMeetingRoom room2 = new ZoomMeetingRoom("MR102", 10, 2, "Z12345", "zoom_acc_987");

        System.out.println("Available Meeting Rooms:");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println();

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Room ID: ");
        String roomId = sc.nextLine();

        System.out.print("Enter Meeting Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter Meeting Time (HH:MM): ");
        String time = sc.nextLine();

        System.out.print("Enter Duration (in minutes): ");
        int duration = sc.nextInt();

        Booking booking = new Booking(empId, roomId, date, time, duration);
        manager.addBooking(booking);

        System.out.println("\nBooking successful!");

        System.out.println("\nBookings on " + date + ":");
        for (Booking b : manager.getBookingsByDate(date)) {
            System.out.println(b);
        }

        sc.close();
    }
}
