import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;


    @Before
    public void before(){
        ArrayList<Guest> testGuests = new ArrayList<>();
        room = new Room(2, testGuests);
    }

   @Test
    public void hasCapacity(){
       assertEquals(2, room.getCapacity());
   }
}