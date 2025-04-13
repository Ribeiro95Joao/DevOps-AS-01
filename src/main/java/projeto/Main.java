package projeto;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new MeuHandler());
        server.setExecutor(null); // Usa o executor padrão
        System.out.println("Servidor iniciado em http://localhost:8080");
        server.start();
    }

    static class MeuHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String resposta = "Rodando Aplicação no DOCKER!!";
            exchange.sendResponseHeaders(200, resposta.length());
            OutputStream os = exchange.getResponseBody();
            os.write(resposta.getBytes());
            os.close();
        }
    }
}

