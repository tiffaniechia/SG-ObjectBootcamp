import org.junit.Before;
import org.junit.Test;
import radio.BaseRadio;
import radio.ExpensiveRadio;
import vehicle.BaseVehicle;
import vehicle.Car;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class DriverTest {

    BaseVehicle vehicle;
    BaseRadio radio;

    //subclasses must share the same behaviour as the base class + subclasses of the same base class must be substitutable with each other
    // helicopter needs to take off before it accelerate and hence it breaks the contract/api therefore not substitutable with care
    //helicopter is not an extension of car but a complete modification of the car api so it is not liskov substitution
    // so the idea is that everyone that uses the base class would want to use everything in the subclass, so all subclasses need to be substitutable with each other
        // having another subclass that doesn't substitute would then break cohesion

    @Before
    public void setup() {
        vehicle = new Car();
        // usage of helicopter needs to get abstracted out so flying vehicle -> helicopter, land vehicle -> car -> sportscar. then it'll be new pilot & new driver respectively
        radio = new ExpensiveRadio();
    }

    @Test
    public void shouldSpeedUp(){
        Driver driver = new Driver(radio, vehicle);
        driver.speedUp();

        assertThat(vehicle.getSpeed(), is(equalTo(1)));
    }

    @Test
    public void shouldSlowDown(){
        Driver driver = new Driver(radio, vehicle);
        driver.speedUp();

        driver.slowDown();

        assertThat(vehicle.getSpeed(), is(equalTo(0)));
    }

    @Test
    public void shouldTurnOnRadio(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();

        assertThat(radio.isTurnedOn(), is(true));
    }

    @Test
    public void shouldTurnOffRadioToConcentrate(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.concentrate();

        assertThat(radio.isTurnedOn(), is(false));
    }

    @Test
    public void shouldTurnRadioUpWhenFavouriteSongComesOn(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.listeningToFavouriteSong();

        assertThat(radio.getVolume(), is(equalTo(11)));
    }

    @Test
    public void shouldTurnRadioDownToTalkToPassenger(){
        Driver driver = new Driver(radio, vehicle);
        driver.listenToRadio();
        driver.talkingToPassenger();

        assertThat(radio.getVolume(), is(equalTo(9)));
    }
}
