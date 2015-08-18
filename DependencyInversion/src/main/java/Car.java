public class Car implements AudioInterface {
    protected int speed = 0;
    protected int speedIncreaseRate;

    public Car(){
        speedIncreaseRate = 1;
    }

    public void accelerate() {
        speed += speedIncreaseRate;
    }

    public void decelerate() {
        speed -= speedIncreaseRate;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseVolume() {

    }


}
