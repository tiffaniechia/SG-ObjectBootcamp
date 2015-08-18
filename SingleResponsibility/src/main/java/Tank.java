public class Tank {
//implementing two interfaces is a clear sign of something doing two things because well interfaces each do one thing
    private final Driver driver;
    private final Gunner gunner;


    public Tank(int initialShells) {
        driver = new Driver();
        gunner = new Gunner(initialShells);
    }

    public void raiseAlarm() {
        throw new AlarmRaisedException();
    }

    public void reset() {
        driver.resetSpeed();
        gunner.resetGun();
    }


    public int getLeftSpeed() {
        return driver.getLeftSpeed();
    }

    public int getRightSpeed() {
        return driver.getRightSpeed();
    }

    public int getGunAngle() {
        return gunner.getGunAngle();
    }

    public int getGunRake() {
        return gunner.getGunRake();
    }

    public int getRemainingShells() {
        return gunner.getRemainingShells();
    }

    public void rotateGunLeft() {
        gunner.rotateGunLeft();
    }

    public void rotateGunRight() {
        gunner.rotateGunRight();
    }

    public void raiseGun() {
        gunner.raiseGun();
    }

    public void lowerGun() {
        gunner.lowerGun();
    }

    public void fire() throws OutOfShellsException {
        gunner.fire();
    }

    public void stopLeft() {
        driver.stopLeft();
    }

    public void stopRight() {
        driver.stopRight();
    }

    public void increaseLeftSpeed() {
        driver.increaseLeftSpeed();
    }

    public void decreaseLeftSpeed() {
        driver.decreaseLeftSpeed();
    }

    public void increaseRightSpeed() {
        driver.increaseRightSpeed();
    }

    public void decreaseRightSpeed() {
        driver.decreaseRightSpeed();
    }


}
