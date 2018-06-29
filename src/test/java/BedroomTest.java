import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    ArrayList<Guest> guests;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Iona");
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(2, guests, 105, 50);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(105, bedroom.getRoomNumber());
    }

    @Test
    public void canSetRoomNumber(){
        bedroom.setRoomNumber(205);
        assertEquals(205, bedroom.getRoomNumber());
    }

}
