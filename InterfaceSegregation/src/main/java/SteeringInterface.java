/**
 * Created by tiffaniechia on 18/08/2015.
 */
public interface SteeringInterface extends Alarmable{

    void stopLeft();

    void stopRight();

    void increaseLeftSpeed();

    void decreaseLeftSpeed();

    void increaseRightSpeed();

    void decreaseRightSpeed();

    int getRightSpeed();

    int getLeftSpeed();
}
