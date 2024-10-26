import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class server {
    public static void main(String[] args) {
        int port = 1234; // Numero di porta del server
        
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server avviato su porta " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept(); // Accetta una connessione dal client
                System.out.println("Client connesso: " + clientSocket.getInetAddress());

                OutputStream outputStream = clientSocket.getOutputStream();
                InputStream inputStream = clientSocket.getInputStream();

                // Invia un messaggio al client
                String message = "";
                
                // scelta del computer
                Random random = new Random(System.currentTimeMillis());
                int randomNumber = random.nextInt(3);
                String Computer = "";
                switch (randomNumber) {
                    case 0:
                    Computer = "carta" + "\n";
                    break;
                    case 1:
                    Computer = "sasso" + "\n";
                    break;
                    case 2:
                    Computer = "forbice" + "\n";
                }
                
                System.out.println("Computer:" + Computer);
                message = "Benvenuto su carta forbice sasso! \n Scegli tra carta forbice e sasso: ";
                outputStream.write(message.getBytes());
                String Player = "";
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                
                if (bytesRead != -1) {
                    Player = new String(buffer, 0, bytesRead);
                }
                outputStream.write(message.getBytes());

                System.out.println("Player:" + Player);
                if(!Player.equals(Computer)){
                    switch (Player) {
                        case "sasso\n":
                        if(Computer.equals("carta\n")){
                            message = "Hai perso, il computer aveva " + Computer;
                        }else message = "Bravo hai vinto, il computer aveva " + Computer;
                        break;
                        case "carta\n":
                        if(Computer.equals("forbice\n")){
                            message = "Hai perso, il computer aveva " + Computer;
                        }else message = "Bravo hai vinto, il computer aveva " + Computer;
                        break;
                        case "forbice\n":
                        if(Computer.equals("sasso\n")){
                            message = "Hai perso, il computer aveva " + Computer;
                        }else message = "Bravo hai vinto, il computer aveva " + Computer;
                        break;
                        default:
                        message = "hai perso! Devi inserire qualcosa di valido";
                    }
                } else message = "Pareggio!";

                outputStream.write(message.getBytes());

                inputStream.close();
                outputStream.close(); // Chiudi l'output stream
                clientSocket.close(); // Chiudi la connessione del client
                System.out.println("Client disconnesso");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}