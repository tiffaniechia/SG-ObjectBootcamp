package vehicle;

public abstract class BaseVehicle {
    public int getSpeed() {
        return speed;
    }

    private int speed = 0;
    //abstract so that base classes have to use it else error but you can leave it blank
    protected abstract int maxSpeed();

    public void accelerate() {
        if(speed < maxSpeed()) speed += 1;
    }

    public void decelerate() {
        if(speed > 0) speed -= 1;
    }
}
