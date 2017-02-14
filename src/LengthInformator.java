/**
 * Created by Kalaman on 13.02.17.
 */
public class LengthInformator implements Ausgabe{
    Ausgabe ausgabe;

    public LengthInformator(Ausgabe ausgabe)
    {
        this.ausgabe = ausgabe;
    }
    @Override
    public void print(String s) {
        s += " |" + s.length();
        ausgabe.print(s);
    }
}
