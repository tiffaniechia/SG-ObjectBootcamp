public class Driver {

    private Car car;
    private Radio radio;

    public Driver(Car car, Radio radio) {
//doesnt care what type of car it is as long as it can do all these actions
        //so instead of having a concrete radio and car, we now have an abstract car and radio
        this.car = car;
        this.radio = radio;
    }

    public void listenToRadio(){
        radio.turnOn();
    }

    public void listeningToFavouriteSong(){
        radio.turnUp();
    }

    public void talkingToPassenger(){
        radio.turnDown();
    }

    public void concentrate(){
        radio.turnOff();
    }

    public void speedUp(){
        car.accelerate();
    }

    public void slowDown(){
        car.decelerate();
    }
}
