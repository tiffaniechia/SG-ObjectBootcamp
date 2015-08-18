public class Gunner{
    private GunningInterface gunningInterface;

    public Gunner(GunningInterface gunningInterface) {
        this.gunningInterface = gunningInterface;

    }

    public void raiseGun() {
        gunningInterface.raiseGun();
    }

    public void lowerGun() {
        gunningInterface.lowerGun();
    }

    public void raiseGunToTop() {
        while(true) {
            int initialRake = gunningInterface.getGunRake();
            raiseGun();
            if (initialRake == gunningInterface.getGunRake()) break;
        }
    }

    public void lowerGunToBottom() {
        while(true) {
            int initialRake = gunningInterface.getGunRake();
            lowerGun();
            if (initialRake == gunningInterface.getGunRake()) break;
        }
    }

    public void rotateGunLeft() {
        gunningInterface.rotateGunLeft();
    }

    public void rotateGunRight() {
        gunningInterface.rotateGunRight();
    }

    public void rotateGunToFront() {
        while (gunningInterface.getGunAngle() != 0) rotateGunRight();
    }

    public void fire() throws OutOfShellsException {
        gunningInterface.fire();
    }

    public void raiseAlarm() {
        gunningInterface.raiseAlarm();
    }
}
