import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class DriverTest {
    SteeringInterface steeringInterface;

    @Before
    public void setup() {
        steeringInterface = new Tank(5);
    }

    @Test
    public void shouldIncreaseBothLeftAndRightWhenMovingForward() {
        Driver driver = new Driver(steeringInterface);

        driver.moveForward();

        assertThat(steeringInterface.getLeftSpeed(), is(greaterThan(0)));
        assertThat(steeringInterface.getRightSpeed(), is(greaterThan(0)));
        assertThat(steeringInterface.getRightSpeed(), is(equalTo(steeringInterface.getLeftSpeed())));
    }

    @Test
    public void shouldDecreaseBothLeftAndRightWhenMovingBackward() {
        Driver driver = new Driver(steeringInterface);

        driver.moveBackward();

        assertThat(steeringInterface.getLeftSpeed(), is(lessThan(0)));
        assertThat(steeringInterface.getRightSpeed(), is(lessThan(0)));
        assertThat(steeringInterface.getRightSpeed(), is(equalTo(steeringInterface.getLeftSpeed())));
    }

    @Test
    public void shouldMakeLeftSpeedGreaterThanRightSpeedWhenTurningRight() {
        Driver driver = new Driver(steeringInterface);

        driver.turnRight();

        assertThat(steeringInterface.getRightSpeed(), is(lessThan(steeringInterface.getLeftSpeed())));
    }

    @Test
    public void shouldMakeRightSpeedGreaterThanLeftSpeedWhenTurningLeft() {
        Driver driver = new Driver(steeringInterface);

        driver.turnLeft();

        assertThat(steeringInterface.getRightSpeed(), is(greaterThan(steeringInterface.getLeftSpeed())));
    }

    @Test
    public void shouldStopWhenCallingStop() {
        Driver driver = new Driver(steeringInterface);
        driver.moveForward();

        driver.allStop();

        assertThat(steeringInterface.getLeftSpeed(), is(equalTo(0)));
        assertThat(steeringInterface.getRightSpeed(), is(equalTo(0)));

    }

    @Test(expected=AlarmRaisedException.class)
    public void shouldRaiseAlarmExceptionWhenRaisingAlarm() {
        Driver driver = new Driver(steeringInterface);
        driver.raiseAlarm();
    }
}
