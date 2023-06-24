public abstract class Jarmu {
    public int speed;
    protected String rendszam;

    public Jarmu(int speed, String rendszam) {
        this.speed = speed;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtottE(int speedlimit);


    @Override
    public String toString() {
        return rendszam + "-" + speed;
    }
}
