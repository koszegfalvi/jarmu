public class AudiS8 extends Jarmu {
    private final boolean lezerblokkolo;

    public AudiS8(String rendszam, int speed, boolean lezerblokkolo) {
        super(speed, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }


    @Override
    public boolean gyorshajtottE(int speedlimit) {
        if (lezerblokkolo) {
            return false;
        }
        if (speed > speedlimit) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Audi : " + super.toString();
    }
}
