package javasimplesocket;

import java.net.*;
import java.io.*;

public class SocketServer {

	public static void main(String[] args) throws IOException
	{
		ServerSocket s = new ServerSocket(1254); // 1254 numaral� port hizmete a��k,
		
		Socket s1 = s.accept(); // ba�lant� bekleniyor

		OutputStream s1out = s1.getOutputStream();
		
		DataOutputStream dos = new DataOutputStream(s1out);
		
		dos.writeUTF("U�ur H�d�r");
		
		dos.close();
		s1out.close();
	}

}
