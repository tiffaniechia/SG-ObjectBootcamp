public class Driver implements TankDriverInterface {
    int leftSpeed = 0;
    int rightSpeed = 0;

    public Driver() {
    }

    public void resetSpeed() {
        leftSpeed = 0;
       rightSpeed = 0;
    }

    //can further decompose driver down to left object and right object

    public int getLeftSpeed() {
        return leftSpeed;
    }

    public int getRightSpeed() {
        return rightSpeed;
    }

    public void stopLeft() {
        leftSpeed = 0;
    }

    public void stopRight() {
        rightSpeed = 0;
    }

    public void increaseLeftSpeed() {
        leftSpeed += 1;
    }

    public void decreaseLeftSpeed() {
        leftSpeed -= 1;
    }

    public void increaseRightSpeed() {
        rightSpeed += 1;
    }

    public void decreaseRightSpeed() {
        rightSpeed -= 1;
    }

    @Override
    public void raiseAlarm() {

    }
}