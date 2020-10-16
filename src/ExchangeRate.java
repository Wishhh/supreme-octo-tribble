import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class ExchangeRate {

    public static void get_response() throws IOException, ParserConfigurationException, SAXException {



        XMLReader myReader = XMLReaderFactory.createXMLReader();
        myReader.setContentHandler(handler);
        myReader.parse(new InputSource(new URL("http://www.nbg.ge/rss.php").openStream()));


    }

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        get_response();
    }
}
