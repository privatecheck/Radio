import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void changeStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.next();
        station.prev();

        int actual = station.getCurrentStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void changeVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.increaseVolume();
        volume.decreaseVolume();

        int actual = volume.getCurrentVolume();
        int expected = 9;

        assertEquals(actual, expected);
    }
}

