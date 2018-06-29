import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Iona");
    }

    @Test
    public void hasName(){
        assertEquals("Iona", guest.getName());
    }

}
