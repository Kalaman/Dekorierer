/**
 * Created by Kalaman on 13.02.17.
 */
public class Main {

    public static void main (String [] args){

        Konsolenausgabe console = new Konsolenausgabe();
        AusgabeAggregator ausgabeAggregator = new AusgabeAggregator();

        ausgabeAggregator.print("Ich ");
        ausgabeAggregator.print("funktioniere ");
        ausgabeAggregator.print(" !");

        System.out.println(ausgabeAggregator);

        Uppercase uppercase = new Uppercase(console);
        uppercase.print("ich bin eigentlich klein");

        Wordcounter wordcounter = new Wordcounter("Hallo",console);
        wordcounter.print("Hallo");
        wordcounter.print("Hallo1");

        LetterCounter letterCounter = new LetterCounter(console);
        letterCounter.print("Ich rufe es");
        letterCounter.print("zweimal auf");
        console.print("" + letterCounter.getLetterSum());


        LengthInformator lengthInformator = new LengthInformator(console);

        lengthInformator.print("Hallo123");
        lengthInformator.print("eins zwei drei test");

        System.out.println(wordcounter.getCount());

    }
}
