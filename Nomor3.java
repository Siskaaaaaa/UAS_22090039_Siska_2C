import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        String url = "https://dummyjson.com/products/category/smartphones";
        String xConsID = "harber123";
        String xUserKey = "_tabc4XbR";

        String jsonResponse = Nomor3.sendGETRequest(url, xConsID, xUserKey);
        List<No3.Product> products = No3.parseJSON(jsonResponse);
        System.out.println("Data JSON sebelum diurutkan:");
        for (No3.Product product : products) {
            System.out.println(product);
        }
    }
    private static String sendGETRequest(String url, String xConsID, String xUserKey) {
        return null;
    }

    public static String getResponseFromHttpUrl(URL url) throws IOException {
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try {
                InputStream in = urlConnection.getInputStream();
                Scanner scanner = new Scanner(in);
                scanner.useDelimiter("\\A");
                boolean hasInput = scanner.hasNext();
                if (hasInput) {
                    return scanner.next();
                } else {
                    return  null;
                }
            } finally {
                urlConnection.disconnect();
            }
        }
    }