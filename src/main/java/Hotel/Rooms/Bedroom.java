package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private String roomNumber;
    private int nightlyRate;


    public Bedroom(int capacity, ArrayList<Guest> guests, String roomNumber, int nightlyRate){
        super(capacity, guests);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }


    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}
