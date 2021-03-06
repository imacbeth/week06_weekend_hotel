import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
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
        guest = new Guest("Iona", 200);
        guests = new ArrayList<>();
        guests.add(guest);
        bedroom = new Bedroom(RoomType.DOUBLE, guests, "105", 50);
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals("105", bedroom.getRoomNumber());
    }

    @Test
    public void canSetRoomNumber(){
        bedroom.setRoomNumber("205");
        assertEquals("205", bedroom.getRoomNumber());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(50, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void canSetNightlyRate(){
        bedroom.setNightlyRate(100);
        assertEquals(100, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void canGetGuests(){
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuest(){
        bedroom.checkGuestsIntoRoom(guest);
        assertEquals(2, bedroom.getGuests().size());
    }

    @Test
    public void canCheckGuestsOut(){
        bedroom.checkGuestsIntoRoom(guest);
        bedroom.checkGuestsOutOfRoom();
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canCheckIfRoomIsBooked(){
        bedroom.checkGuestsIntoRoom(guest);
        assertEquals(true, bedroom.isNotBooked());
    }


}
