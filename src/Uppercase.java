/**
 * Created by Kalaman on 13.02.17.
 */
public class Uppercase implements Ausgabe{

    Ausgabe ausgabe;

    public Uppercase(Ausgabe ausgabe)
    {
        this.ausgabe = ausgabe;
    }

    @Override
    public void print(String s) {
        s = s.toUpperCase();
        ausgabe.print(s);
    }
}
