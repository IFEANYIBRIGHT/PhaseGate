import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniParkingLotTest {

    @Test
    public void parkingLotTest() {

        ArrayList<String> parkingLot = new ArrayList<>();

        MiniParkingLot cars = new MiniParkingLot();

        ArrayList<String> result = cars.miniParkingslot(parkingLot);

 
        assertEquals(21, result.size());

 
        for (String slot : result) {
            assertEquals("Empty", slot);
        }
    }
}


 
