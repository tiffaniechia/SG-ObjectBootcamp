
public interface GunningInterface extends Alarmable {

    //interfaces extends each other not implement (only for concrete classes)
    int getLeftSpeed();

    int getRightSpeed();

    int getGunAngle();

    int getGunRake();

    int getRemainingShells();

    void rotateGunLeft();

    void rotateGunRight();

    void raiseGun();

    void lowerGun();

    void fire() throws OutOfShellsException;

}
