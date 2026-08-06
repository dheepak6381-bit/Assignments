import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <title>Simple Java Website</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <h1>harish!</h1>\n" +
                    "    <p>padma.</p>\n" +
                    "    <p>naveen weds abrar </p>\n" +
                    "</body>\n" +
                    "</html>";

                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                exchange.sendResponseHeaders(200, response.getBytes().length);

                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes());
                }
            }
        });

        server.setExecutor(null);
        server.start();

        System.out.println("Server started on http://dheepak:8080/");
        System.out.println("Open your browser and visit the URL above.");
    }
}