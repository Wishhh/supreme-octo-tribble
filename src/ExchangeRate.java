import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;


public class ExchangeRate {

    static double get_response(){

        try{
            URL rssUrl = new URL("http://www.nbg.ge/rss.php");
            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
            StringBuilder sourceCode = new StringBuilder();
            String line;
            while ((line = in.readLine())!= null){
                if (line.contains("<td>")){
                    int firstPos = line.indexOf("<td>");
                    String temp = line.substring(firstPos);
                    temp = temp.replace("<td>", "");
                    int lastPos = temp.indexOf("</td>");
                    temp = temp.substring(0, lastPos);
                    sourceCode.append(temp).append("\n");
                }
            }
            in.close();

            String[] lines = sourceCode.toString().split("\n");
            String[][] wordsArray = new String[lines.length][];
            for (int i = 0; i < lines.length; i++){
                wordsArray[i] = new String[] { lines[i]};
            }

            double USD=0;
            for (int i = 0; i < lines.length; i++){
                if(Arrays.toString(wordsArray[i]).equals("[USD]")){
                    String strUSD = Arrays.toString(wordsArray[i+2]);
                    String finUSD = strUSD.substring(1, strUSD.length() - 1);
                    USD = Double.parseDouble(finUSD);
                }
            }
            return USD;
        }

        catch (IOException e) {
            e.printStackTrace();
        }


        return 0;
    }

    static void exchangeRate(Double USD , Double GEL){
        Scanner input = new Scanner(System.in);
        System.out.println("1.USD to GEL" + "\n" + "2.GEL to USD");
        String Case = input.nextLine();
        if (Case.equals("1")){
            System.out.println("1 USD = " + GEL/USD + "GEL");
        }
        if (Case.equals("2"))
            System.out.println("1 USD = " + USD/GEL + "GEL");
    }

    public static void main(String[] args) {
        Double GEL = 1d;
        exchangeRate(get_response(), GEL);

    }
}
