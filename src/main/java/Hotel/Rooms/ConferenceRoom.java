package Hotel.Rooms;

import Hotel.Rooms.RoomType;
import Hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {


    private String roomName;
    private int dailyRate;


    public ConferenceRoom(RoomType roomType, ArrayList<Guest> guests, String roomName, int dailyRate){
        super(roomType, guests);
        this.roomName = roomName;
        this.dailyRate = dailyRate;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getDailyRate() {
        return this.dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}


