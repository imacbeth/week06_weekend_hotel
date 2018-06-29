import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ArrayList<Guest> guests;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Iona");
        guests = new ArrayList<>();
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCEROOM, guests, "Lovelace", 150);
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Lovelace", conferenceRoom.getRoomName());
    }

    @Test
    public void canSetRoomNumber(){
        conferenceRoom.setRoomName("205");
        assertEquals("205", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(150, conferenceRoom.getDailyRate());
    }

    @Test
    public void canSetNightlyRate(){
        conferenceRoom.setDailyRate(200);
        assertEquals(200, conferenceRoom.getDailyRate());
    }

    @Test
    public void canGetGuests(){
        assertEquals(1, conferenceRoom.getGuests().size());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

}
