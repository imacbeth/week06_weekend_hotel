package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private String roomNumber;
    private RoomType roomType;
    private double nightlyRate;


    public Bedroom(RoomType roomType, ArrayList<Guest> guests, String roomNumber, double nightlyRate){
        super(roomType, guests);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }


    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }


}
