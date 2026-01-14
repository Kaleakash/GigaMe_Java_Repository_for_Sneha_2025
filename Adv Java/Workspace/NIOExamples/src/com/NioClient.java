package com;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SocketChannel client = SocketChannel.open();
		client.configureBlocking(false);  // non block 
			client.connect(new InetSocketAddress("localhost",9090));
		while(!client.finishConnect()) {}
		String data = "a";
		ByteBuffer buffer = ByteBuffer.wrap(data.getBytes()); 
		client.write(buffer);
		client.close();
	}

}
