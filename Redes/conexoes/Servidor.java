package conexoes;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Date;

public class Servidor {
    public static void main(String args[]) {
        int porta = 33333;
        
        if(args.length >= 1) {
            porta = Integer.valueOf(args[0]);
        }
        
        DatagramSocket sock;
        
        try {
            sock = new DatagramSocket(porta);
            
            byte buffer[] = new byte[8];
            
            DatagramPacket pct = new DatagramPacket(buffer, buffer.length);
            
            System.out.println("Esperando mensagem do cliente...");
            
            try {
                sock.receive(pct);
            }
            catch(IOException ex) {
                System.err.println("ERRO: Recebimento de pacote!");
            }
            
            Date data = new Date();
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            
            DataOutputStream dos = new DataOutputStream(baos);
            
            try {
                dos.writeLong(data.getTime());
            }
            catch(IOException ex) {
                System.err.println("ERRO: Conversão da data para oa array!");
            }
            
            System.out.println("Enviando data para cliente " + pct.getAddress());
            
            buffer = baos.toByteArray();
            pct = new DatagramPacket(buffer, buffer.length, pct.getAddress(), pct.getPort());
            
            try {
                sock.send(pct);
            }
            catch(IOException ex) {
                System.err.printf("ERRO: Envio de pacote para %s.\n", pct.getAddress().toString());
            }
            
            System.out.printf("Pacote enviado para %s.\n", pct.getAddress().toString());
            System.out.printf("Data enviada: %s.\n", data.toString());
        }
        catch(SocketException ex) {
            System.err.println("ERRO: Criação do socket!");
        }
    }
}
