public class Gunner implements TankGunnerInterface {
    int gunAngle = 0;
    int gunRake = 0;
     int remainingShells;

    public Gunner(int initialShells){
        remainingShells = initialShells;
    }

    //can further decompose gunner to aim and fire objects

    public int getGunAngle() {
        return gunAngle;
    }

    public int getGunRake() {
        return gunRake;
    }

    public int getRemainingShells() {
        return remainingShells;
    }

    public void rotateGunLeft() {
        gunAngle -= 45;
        while (gunAngle < 0) gunAngle += 360;
    }

    public void rotateGunRight() {
        gunAngle += 45;
        while (gunAngle >= 360) gunAngle -= 360;
    }

    public void raiseGun() {
        if (gunRake < 45) gunRake += 5;
    }

    public void lowerGun() {
        if (gunRake > 0) gunRake -= 5;
    }

    public void fire() throws OutOfShellsException {
        if (remainingShells <= 0) throw new OutOfShellsException();
        remainingShells -= 1;
    }

    @Override
    public void raiseAlarm() {

    }

    public void resetGun() {
        gunAngle = 0;
        gunRake = 0;
    }
}