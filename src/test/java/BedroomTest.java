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

    @Test
    public void canGetNightlyRate(){
        assertEquals(50, bedroom.getNightlyRate());
    }

    @Test
    public void canSetNightlyRate(){
        bedroom.setNightlyRate(100);
        assertEquals(100, bedroom.getNightlyRate());
    }

    @Test
    public void canGetGuests(){
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }


}
