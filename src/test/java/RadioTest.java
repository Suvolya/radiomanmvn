import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioman.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadiostation() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(9);

        int expected = 9;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(10);

        int expected = 0;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastStation() {
        Radio rad = new Radio();

        rad.setToLastStation();

        int expected = 9;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstStation() {
        Radio rad = new Radio();

        rad.setToFirstStation();

        int expected = 0;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(9);

        int expected = 9;
        int actual = rad.getCurrentRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(5);

        int expected = 6;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(9);

        int expected = 0;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToNextStationBeforMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(8);

        int expected = 9;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationAfterMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(10);

        int expected = 1;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationMin() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(0);

        int expected = 1;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStationBeforMin() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(-1);

        int expected = 1;
        int actual = rad.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(-1);

        int expected = 9;
        int actual = rad.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStation() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(8);

        int expected = 7;
        int actual = rad.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationMax() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(9);

        int expected = 8;
        int actual = rad.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationAboveMin() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(1);

        int expected = 0;
        int actual = rad.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPreviousStationMin() {
        Radio rad = new Radio();

        rad.setCurrentRadiostation(0);

        int expected = 9;
        int actual = rad.previousStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAbovewMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeequalsMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rad = new Radio();

        rad.setToMinVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();

        rad.setToMaxVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);

        int expected = 8;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 10;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBeforMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);

        int expected = 10;
        int actual = rad.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);

        int expected = 2;
        int actual = rad.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeBelowMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);

        int expected = 0;
        int actual = rad.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeAverege() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);

        int expected = 9;
        int actual = rad.lowerVolume();

        Assertions.assertEquals(expected, actual);
    }
}