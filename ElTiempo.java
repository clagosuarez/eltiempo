import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ElTiempo {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
        Elements temperatura = doc.getElementsByClass("today_nowcard-temp");
        Elements frase = doc.getElementsByClass("today_nowcard-phrase");
        String titulo = doc.title();
        System.out.println("Hoy está "+frase.text()+" y hace "+temperatura.text()+". Datos extraídos de "+titulo);
    }
}
