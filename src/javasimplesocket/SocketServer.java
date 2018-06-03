package javasimplesocket;

import java.net.*;
import java.io.*;

public class SocketServer {

	public static void main(String[] args) throws IOException
	{
		ServerSocket s = new ServerSocket(1254); // 1254 numaralý port hizmete açýk,
		
		Socket s1 = s.accept(); // baðlantý bekleniyor

		OutputStream s1out = s1.getOutputStream();
		
		DataOutputStream dos = new DataOutputStream(s1out);
		
		dos.writeUTF("Uður Hýdýr");
		
		dos.close();
		s1out.close();
	}

}
