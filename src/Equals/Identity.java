package Equals;

public class Identity {
    public String series;
    public int number;

    public String name;
    public String surname;

    @Override
    public boolean equals(Object o) {
        Identity i2 = (Identity) o;
        if (this.number == i2.number) {
            if (this.series.equals(i2.series)) {
                return true;
            }
        }
        return false;
    }
}
