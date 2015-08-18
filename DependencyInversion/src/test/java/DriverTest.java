import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DriverTest {
    Car car;
    Radio radio;

    @Before
    public void setUp() {
        car = new Car();
        radio = new Radio();
    }

    @Test
    public void shouldSpeedUp() {

        Driver driver = new Driver(car, radio);
        driver.speedUp();

        assertThat(car.getSpeed(), is(1));
        //assert car speed has increased
    }

    @Test
    public void shouldSlowDown() {
        Driver driver = new Driver(car, radio);
        driver.slowDown();

        assertThat(car.getSpeed(), is(-1));
        //assert car speed has decreased
    }

    @Test
    public void shouldTurnOnRadio() {
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();

        assertThat(radio.isTurnedOn(), is(true));
        //assert radio is on
    }

    @Test
    public void shouldTurnOffRadioToConcentrate() {
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();
        assertThat(radio.isTurnedOn(), is(true));
        driver.concentrate();

        assertThat(radio.isTurnedOn(), is(false));
        //assert radio is off
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn() {
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();
        driver.listeningToFavouriteSong();

        assertThat(radio.getVolume(), is(11));
        //assert volume has increased
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger() {
        Driver driver = new Driver(car, radio);
        driver.listenToRadio();
        driver.talkingToPassenger();

        assertThat(radio.getVolume(), is(9));
        //assert volume has decreased
    }

    @Test
    public void shouldCreateSportsCar() {
        SportsCar sportsCar = new SportsCar();
        Driver driver = new Driver(sportsCar, radio);

        driver.speedUp();
        assertThat(sportsCar.getSpeed(), is(2));

    }
}
