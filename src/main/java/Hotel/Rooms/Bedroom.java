package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private int nightlyRate;


    public Bedroom(int capacity, ArrayList<Guest> guests, int roomNumber, int nightlyRate){
        super(2, guests);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
