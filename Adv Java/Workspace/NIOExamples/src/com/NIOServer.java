package com;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIOServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocketChannel server = ServerSocketChannel.open();
		server.bind(new InetSocketAddress(9090));// range of port number between 0 to 65535
		System.out.println("Server Starter with port number 9090");
		while(true) {
			SocketChannel client = server.accept();	// if any client application in same machine or different machine send reqeust with port 9090
			System.out.println("Client connected");
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			//System.out.println(client.read(buffer, 0, 1));
			//	buffer.flip();
				//System.out.println(buffer);
			//client.close();
		}
	}

}
