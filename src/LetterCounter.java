/**
 * Created by Kalaman on 13.02.17.
 */
public class LetterCounter implements Ausgabe{

    Ausgabe ausgabe;
    int letterSum = 0;

    public LetterCounter (Ausgabe ausgabe){
        this.ausgabe = ausgabe;
    }

    @Override
    public void print(String s) {
        letterSum += s.length();
        ausgabe.print(s);
    }

    public int getLetterSum ()
    {
        return letterSum;
    }
}
