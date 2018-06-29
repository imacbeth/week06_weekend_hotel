import Hotel.Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;


   @Test
    public void hasCapacity(){
       assertEquals(2, room.getCapacity());
   }

   @Test
    public void canSetCapacity(){
        room.setCapacity(4);
        assertEquals(4, room.getCapacity());
   }


}
