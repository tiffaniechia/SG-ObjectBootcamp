public class Driver {
    private SteeringInterface steeringInterface;


    public Driver(SteeringInterface steeringInterface) {

        this.steeringInterface = steeringInterface;
    }

    public void moveForward() {
        allStop();
        steeringInterface.increaseLeftSpeed();
        steeringInterface.increaseRightSpeed();
    }

    public void moveBackward() {
        allStop();
        steeringInterface.decreaseLeftSpeed();
        steeringInterface.decreaseRightSpeed();
    }

    public void allStop() {
        steeringInterface.stopLeft();
        steeringInterface.stopRight();
    }

    public void turnLeft() {
        allStop();
        steeringInterface.increaseRightSpeed();
        steeringInterface.decreaseLeftSpeed();
    }

    public void turnRight() {
        allStop();
        steeringInterface.increaseLeftSpeed();
        steeringInterface.decreaseRightSpeed();
    }

    public void raiseAlarm() {
        steeringInterface.raiseAlarm();
    }
}
