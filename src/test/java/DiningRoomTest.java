import Hotel.Guest;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    ArrayList<Guest> guests;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Iona");
        guests = new ArrayList<>();
        guests.add(guest);
        diningRoom = new DiningRoom(RoomType.DININGROOM, guests);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, diningRoom.getCapacity());
    }
}