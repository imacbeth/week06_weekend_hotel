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

    public void checkGuestsIntoRoom(Guest guest, String roomName){
        Bedroom selectedBedroom = this.findBedroom(roomName);
        if (!selectedBedroom.isBooked()){
            selectedBedroom.checkGuestsIntoRoom(guest);
        return;
        }
        ConferenceRoom selectedConferenceRoom = this.findConferenceRoom(roomName);
        if (!selectedConferenceRoom.isBooked()){
            selectedConferenceRoom.checkGuestsIntoRoom(guest);
        }
    }


    public void checkGuestsOutOfRoom(String roomName){
        Bedroom selectedBedroom = this.findBedroom(roomName);
        if (selectedBedroom.isBooked()){
            selectedBedroom.checkGuestsOutOfRoom();
            return;
        }
        ConferenceRoom selectedConferenceRoom = this.findConferenceRoom(roomName);
        if (selectedConferenceRoom.isBooked()){
            selectedConferenceRoom.checkGuestsOutOfRoom();
        }
    }

    public Bedroom findBedroom(String roomName) {
        Bedroom availableBedroom = null;
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomName() == roomName)
            {
                availableBedroom = bedroom;
            }
        }
        return availableBedroom;
    }

    public ConferenceRoom findConferenceRoom(String roomName) {
        ConferenceRoom selectedConferenceRoom = null;
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getRoomName() == roomName)
            {
                selectedConferenceRoom = conferenceRoom;
            }
        }
        return selectedConferenceRoom;

    }

    public DiningRoom findDiningRoom(String roomName) {
        DiningRoom selectedDiningRoom = null;
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRoom.getRoomName() == roomName)
            {
                selectedDiningRoom = diningRoom;
            }
        }
        return selectedDiningRoom;

    }
    public ArrayList<Guest> getGuestsPerRoom(String roomName){
        Bedroom selectedBedroom = this.findBedroom(roomName);
        if (selectedBedroom != null){
            return selectedBedroom.getGuests();
        }

        ConferenceRoom selectedConferenceRoom = this.findConferenceRoom(roomName);
        if (selectedConferenceRoom != null){
            return selectedConferenceRoom.getGuests();
        }

        DiningRoom selectedDiningRoom = this.findDiningRoom(roomName);
        if (selectedDiningRoom != null){
            return selectedDiningRoom.getGuests();
        }

        return null;
    }



}

