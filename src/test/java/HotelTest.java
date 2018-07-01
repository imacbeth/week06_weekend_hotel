import Hotel.Hotel;
import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    ArrayList<Guest> guests;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;


    @Before
    public void before(){
        guest = new Guest("Iona", 200);
        guests = new ArrayList<>();
        bedroom1 = new Bedroom(RoomType.DOUBLE, guests,"105", 50 );
        bedroom2 = new Bedroom(RoomType.SUITE, guests,"215", 125);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, guests, "Lovelace", 150);
        diningRoom = new DiningRoom(RoomType.DININGROOM, guests);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void canCheckGuestsIntoRoom(){
        hotel.checkGuestsIntoRoom(guest, "Double");
    assertEquals(1, bedroom1.getGuests().size());
    }

    @Test
    public void canCheckGuestsOut(){
        hotel.checkGuestsIntoRoom(guest, "Double");
        hotel.checkGuestsOutOfRoom("Double");
        assertEquals(0, bedroom1.getGuests().size());
    }

    @Test
    public void canFindBedroomByType(){
        assertEquals(RoomType.DOUBLE, hotel.findBedroom("Double").getRoomType());
    }

}
