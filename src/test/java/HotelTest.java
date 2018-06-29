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

    @Before
    public void before(){
        Guest guest = new Guest("Iona", 200);
        guests = new ArrayList<>();
        Bedroom bedroom1 = new Bedroom(RoomType.DOUBLE, guests,"105", 50 );

    }

//    @Test
//    public void canCheckGuestsIntoRoom(){
//


    @Test
    public void canFindBedroomByType(){
        assertEquals(RoomType.DOUBLE, hotel.findBedroom(RoomType.DOUBLE));
    }

}
