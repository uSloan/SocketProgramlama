package javasimplesocket;

import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

public class SocketClient {

	public static void main(String[] args) throws IOException
	{
		
		Socket s1 = new Socket("localhost",1254); //client baðlandý
		
		InputStream s1In = s1.getInputStream();
		
		DataInputStream dis =  new DataInputStream(s1In);
		
		String st = new String(dis.readUTF());
		
		JOptionPane.showMessageDialog(null, "Socket Programlamaya Hoþgeldiniz" , st , JOptionPane.YES_NO_CANCEL_OPTION);
		
		dis.close();
		s1In.close();
		s1.close();
		
	}

}
