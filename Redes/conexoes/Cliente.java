package conexoes;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.DatagramPacket;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.Date;

public class Cliente {
    public static void main(String args[]) throws UnknownHostException {
        String serv = "127.0.0.1";
        int porta = 33333;
        
        if(args.length >= 1) {
            serv = args[0];
            
            if(args.length == 2) {
                porta = Integer.valueOf(args[1]);
            }
        }
        
        try {
            DatagramSocket sock = new DatagramSocket();
            
            byte buffer[] = new byte[8];
            
            InetAddress end = InetAddress.getByName(serv);
            
            DatagramPacket pct = new DatagramPacket(buffer, buffer.length, end, porta);
            
            System.out.printf("Enviando solicitação de data para %s.\n", end.toString());
            
            try {
                sock.send(pct);
            }
            catch(IOException ex) {
                System.err.println("ERRO: Envio de mensagem para servidor!");
            }
            
            pct = new DatagramPacket(buffer, buffer.length);
            
            System.out.println("Aguardando data do servidor...");
            
            try {
                sock.receive(pct);
            }
            catch(IOException ex) {
                System.err.println("ERRO: Recebimento de mensagem do servidor!");
            }
            
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(buffer));
            
            try {
                Date data = new Date(dis.readLong());
                
                System.out.printf("Data recebida: %s.\n", data.toString());
            }
            catch(IOException ex) {
                System.err.println("ERRO: Conversão de data!");
            }
        }
        catch(SocketException ex) {
            System.err.println("ERRO: Criação do socket!");
        }
    }
}