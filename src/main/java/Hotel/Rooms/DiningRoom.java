package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private RoomType roomType;

    public DiningRoom(RoomType roomType, ArrayList<Guest> guests, String roomNumber, double nightlyRate) {
        super(roomType, guests);
    }
}
