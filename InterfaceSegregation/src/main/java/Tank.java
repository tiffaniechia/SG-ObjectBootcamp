public class Tank implements SteeringInterface, GunningInterface {

    private int leftSpeed = 0;
    private int rightSpeed = 0;
    private int gunAngle = 0;
    private int gunRake = 0;
    private int remainingShells;


    public Tank(int initialShells) {
        remainingShells = initialShells;
    }

    public void raiseAlarm() {
        throw new AlarmRaisedException();
    }

    @Override
    public int getLeftSpeed() {
        return leftSpeed;
    }
    @Override
    public int getRightSpeed() {
        return rightSpeed;
    }
    @Override
    public int getGunAngle() {
        return gunAngle;
    }
    @Override
    public int getGunRake() {
        return gunRake;
    }
    @Override
    public int getRemainingShells() {
        return remainingShells;
    }
    @Override
    public void rotateGunLeft() {
        gunAngle -= 45;
        while (gunAngle < 0) gunAngle += 360;
    }
    @Override
    public void rotateGunRight() {
        gunAngle += 45;
        while (gunAngle >= 360) gunAngle -= 360;
    }
    @Override
    public void raiseGun() {
        if (gunRake < 45) gunRake += 5;
    }
    @Override
    public void lowerGun() {
        if (gunRake > 0) gunRake -= 5;
    }

    @Override
    public void fire() throws OutOfShellsException {
        if (remainingShells <= 0) throw new OutOfShellsException();
        remainingShells -= 1;
    }

    @Override
    public void stopLeft() {
        leftSpeed = 0;
    }
    @Override
    public void stopRight() {
        rightSpeed = 0;
    }
    @Override
    public void increaseLeftSpeed() {
        leftSpeed += 1;
    }
    @Override
    public void decreaseLeftSpeed() {
        leftSpeed -= 1;
    }
    @Override
    public void increaseRightSpeed() {
        rightSpeed += 1;
    }
    @Override
    public void decreaseRightSpeed() {
        rightSpeed -= 1;
    }




}
