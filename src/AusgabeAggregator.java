/**
 * Created by Kalaman on 13.02.17.
 */
public class AusgabeAggregator implements Ausgabe {
    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void print(String s) {
        stringBuffer.append(s);
    }


    @Override
    public String toString() {
        return stringBuffer.toString();
    }
}
