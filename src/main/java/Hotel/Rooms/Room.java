package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;


public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType, ArrayList<Guest> guests){
        this.roomType = roomType;
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public int getCapacity() {
        return this.roomType.getCapacity();
    }

    public RoomType getRoomType(){
        return roomType;
    }

    public void checkGuestsIntoRoom(Guest guest) {
        guests.add(guest);
    }
}
