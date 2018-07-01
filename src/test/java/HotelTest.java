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
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;


    @Before
    public void before(){
        Guest guest = new Guest("Iona", 200);
        guests = new ArrayList<>();
        Bedroom bedroom1 = new Bedroom(RoomType.DOUBLE, guests,"105", 50 );
        Bedroom bedroom2 = new Bedroom(RoomType.SUITE, guests,"215", 125);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        hotel = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void canCheckGuestsIntoRoom(){
        hotel.checkGuestsIntoBedroom(guest, "Double");
    assertEquals();

    }



    @Test
    public void canFindBedroomByType(){
        assertEquals(RoomType.DOUBLE, hotel.findBedroom("Double").getRoomType());
    }

}
