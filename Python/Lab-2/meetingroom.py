class MeetingRoom:
    def __init__(self, room_id, capacity, floor):
        self.room_id = room_id
        self.capacity = capacity
        self.floor = floor

    def show_details(self):
        print(f"\nRoom ID       : {self.room_id}")
        print(f"Capacity      : {self.capacity}")
        print(f"Floor Location: {self.floor}")

class ZoomRoom(MeetingRoom):
    def __init__(self, room_id, capacity, floor, device_id, account_id):
        super().__init__(room_id, capacity, floor)
        self.device_id = device_id
        self.account_id = account_id

    def show_details(self):
        super().show_details()
        print(f"Zoom Device ID: {self.device_id}")
        print(f"Zoom Account  : {self.account_id}")


class RoomBooking:
    def __init__(self, emp_id, room, date, time, duration):
        self.emp_id = emp_id
        self.room = room
        self.date = date
        self.time = time
        self.duration = duration

    def show_booking(self):
        print(f"\nEmployee ID   : {self.emp_id}")
        print(f"Room Booked   : {self.room.room_id}")
        print(f"Meeting Date  : {self.date}")
        print(f"Meeting Time  : {self.time}")
        print(f"Duration (hr) : {self.duration}")

class BookingManager:
    def __init__(self):
        self.bookings = []

    def make_booking(self, booking):
        self.bookings.append(booking)
        print("Booking recorded successfully!")

    def view_bookings_by_date(self, date):
        print(f"\nMeeting bookings for {date}:")
        available = False
        for b in self.bookings:
            if b.date == date:
                b.show_booking()
                available = True
        if not available:
            print("No meetings scheduled on this date.")

if __name__ == "__main__":
    print("=== Meeting Room Management System ===")
    manager = BookingManager()
    all_rooms = []

    total_rooms = int(input("Enter total number of meeting rooms: "))

    for i in range(total_rooms):
        print(f"\n--- Enter details for Room {i + 1} ---")
        has_zoom = input("Does this room support Zoom? (yes/no): ").strip().lower()
        rid = input("Enter Room ID: ")
        cap = int(input("Enter Capacity: "))
        floor = input("Enter Floor Location: ")

        if has_zoom == "yes":
            device = input("Enter Zoom Device ID: ")
            account = input("Enter Zoom Account ID: ")
            room = ZoomRoom(rid, cap, floor, device, account)
        else:
            room = MeetingRoom(rid, cap, floor)

        all_rooms.append(room)
        print("Room information stored successfully!")

    print("\n--- List of Meeting Rooms ---")
    for r in all_rooms:
        r.show_details()

    total_bookings = int(input("\nEnter number of bookings to record: "))

    for i in range(total_bookings):
        print(f"\n--- Booking {i + 1} Details ---")
        emp = input("Enter Employee ID: ")
        rid = input("Enter Room ID to book: ")
        date = input("Enter Meeting Date (YYYY-MM-DD): ")
        time = input("Enter Meeting Time (e.g., 10:00 AM): ")
        dur = input("Enter Duration (in hours): ")

        selected_room = next((r for r in all_rooms if r.room_id == rid), None)

        if selected_room:
            new_booking = RoomBooking(emp, selected_room, date, time, dur)
            manager.make_booking(new_booking)
        else:
            print("Invalid Room ID! Booking not recorded.")

    check_date = input("\nEnter a date to view all bookings (YYYY-MM-DD): ")
    manager.view_bookings_by_date(check_date)