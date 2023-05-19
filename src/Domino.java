public class Domino {
    public String a;
    public String b;
    public int number;
    public Domino(final String a, final String b, int number){
        this.a = a;
        this.b = b;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number +
                ". [" + a +
                " | " + b + "]";
    }
}
