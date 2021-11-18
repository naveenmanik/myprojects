import java.net.*;
import java.io.*;
class client {
public static void main (String []args {
try {
     Socket S = new Socket(localhost",1999);
     Data OutPutStream(s.get InPut Stream());
Data OutPutStream(s.getOutPutStream()); 
       DataInputStream dis = new 
DataInputStream(s.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(!br.readLine().equals("quit")) { 
        dos.writeUTF(br.readLine());
        System.out.println("He says: " + dis.readUTF());   
        dos.flush();          
        }
        s.close();
        } catch (IOException ie) {
         ie.printStackTrace();
       }
    }
} 
     
