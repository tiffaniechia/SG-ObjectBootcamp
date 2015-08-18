import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

public class GunnerTest {
    GunningInterface gunnerInterface;

    @Before
    public void setup() {
        gunnerInterface = new Tank(5);
    }

    @Test
    public void shouldRaiseAndLowerGun() {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.raiseGun();
        gunner.raiseGun();

        assertThat(gunnerInterface.getGunRake(), is(equalTo(10)));

        gunner.lowerGun();

        assertThat(gunnerInterface.getGunRake(), is(equalTo(5)));
    }

    @Test
    public void shouldRaiseGunToTopAndLowerGunToBottom() {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.raiseGunToTop();

        assertThat(gunnerInterface.getGunRake(), is(equalTo(45)));

        gunner.lowerGunToBottom();

        assertThat(gunnerInterface.getGunRake(), is(equalTo(0)));
    }

    @Test
    public void shouldRotateGunToTheLeft() {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.rotateGunLeft();

        assertThat(gunnerInterface.getGunAngle(), is(equalTo(315)));
    }


    @Test
    public void shouldRotateGunToTheRight() {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.rotateGunRight();

        assertThat(gunnerInterface.getGunAngle(), is(equalTo(45)));
    }


    @Test
    public void shouldRotateGunToTheFront() {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.rotateGunRight();
        gunner.rotateGunRight();
        gunner.rotateGunRight();

        assertThat(gunnerInterface.getGunAngle(), is(not(equalTo(0))));

        gunner.rotateGunToFront();

        assertThat(gunnerInterface.getGunAngle(), is(equalTo(0)));
    }

    @Test
    public void shouldFireGun() throws OutOfShellsException {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.fire();

        assertThat(gunnerInterface.getRemainingShells(), is(equalTo(4)));
    }

    @Test(expected = OutOfShellsException.class)
    public void shouldThrowOutOfShellsWhenOutOfShells() throws OutOfShellsException {
        Gunner gunner = new Gunner(gunnerInterface);

        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
        gunner.fire();
    }


    @Test(expected=AlarmRaisedException.class)
    public void shouldRaiseAlarmExceptionWhenRaisingAlarm() {
        Gunner gunner = new Gunner(gunnerInterface);
        gunner.raiseAlarm();
    }
}
