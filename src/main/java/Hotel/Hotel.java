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


//    public void checkGuestsIntoBedrooms(Guest guest, ArrayList<Bedroom> bedrooms){
//        findBedroom(RoomType);
//        if (bedrooms.getGuests().size == 0){
//            bedrooms.checkGuestsIntoRoom(guest);
//        }
//    }


    public Bedroom findBedroom(RoomType roomType) {
        Bedroom availableBedroom = null;
        for (Bedroom bedroom : bedrooms) {
            if (roomType == roomType) {
                availableBedroom = bedroom;
            }
        }
        return availableBedroom;
    }

}

