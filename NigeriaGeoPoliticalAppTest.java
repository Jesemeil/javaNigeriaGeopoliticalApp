import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NigeriaGeoPoliticalAppTest {
    @Test
    public void testValidState() {
        String state ="Lagos";
        String expectedZone = "South-West";
        String actualZone = NigeriaGeopoliticalApp.Zone.getZoneByState(state);
        assertEquals(expectedZone, actualZone);

    }

    @Test

    public void testNullState() {
        String state = "Null";
        String expectedZone = "Null";
        String actualZone = NigeriaGeopoliticalApp.Zone.getZoneByState(state);
        assertEquals(expectedZone, actualZone);

    }
    @Test
    public void testCaseInsensitiveState() {
        String state = "edo";
        String expectedZone ="South-South";
        String actualZone = NigeriaGeopoliticalApp.Zone.getZoneByState(state);
        assertEquals(expectedZone, actualZone);

    }
}
