//not an interface because it only extends the speed


public class SportsCar extends Car {
    public SportsCar() {
        //overrides of variables has to be in the constructor
        speedIncreaseRate = 2;
    }

    @Override
    public void increaseVolume() {

    }
}
