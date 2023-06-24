public class Robogo extends Jarmu implements KisGepjarmu {

    private int maxspeed;


    public Robogo(String rendszam, int speed, int maxspeed) {
        super(speed, rendszam);
        this.maxspeed = maxspeed;
    }

    @Override
    public boolean gyorshajtottE(int speedlimit) {
        if (speed > maxspeed) {
            return true;
        }


        return false;
    }

    @Override
    public boolean hadhatItt(int speed) {
        if (maxspeed > speed) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Robogo : " + super.toString() + " km/h";
    }
}



