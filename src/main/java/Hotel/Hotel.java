package Hotel;

import Hotel.Rooms.*;
import Hotel.Guest;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<Guest> guests;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms,ArrayList<DiningRoom> diningRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getBedrooms(){
        return this.bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return this.conferenceRooms;
    }

    public void checkGuestsIntoBedroom(Guest guest, String roomName){
        Bedroom selectedBedroom = this.findBedroom(roomName);
        if (selectedBedroom.isBooked() == false){
            selectedBedroom.checkGuestsIntoRoom(guest);
        }
    }


    public Bedroom findBedroom(String roomName) {
        Bedroom availableBedroom = null;
        for (Bedroom bedroom : bedrooms) {
            if ((bedroom.getRoomName() == roomName) && !bedroom.isBooked())
            {
                availableBedroom = bedroom;
            }
        }
        return availableBedroom;
    }

    public ArrayList<Guest> getGuestsPerRoom(String roomName){
        Bedroom selectedBedroom = this.findBedroom(roomName);
        if (selectedBedroom != null){
            return selectedBedroom.getGuests();
        }
    }

}

