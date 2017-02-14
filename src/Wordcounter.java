/**
 * Created by Kalaman on 13.02.17.
 */
public class Wordcounter implements Ausgabe{

    Ausgabe ausgabe;
    int count = 0;
    String cmpStr;

    public Wordcounter(String cmpStr,Ausgabe ausgabe)
    {
        this.ausgabe = ausgabe;
        this.cmpStr = cmpStr;
    }

    @Override
    public void print(String s) {
        if (s.equals(cmpStr))
            ++count;
        ausgabe.print(s);
    }

    public int getCount (){
        return count;
    }
}
