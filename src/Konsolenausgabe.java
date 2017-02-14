/**
 * Created by Kalaman on 13.02.17.
 */
public class Konsolenausgabe implements Ausgabe{

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}
