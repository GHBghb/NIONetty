package com.cn.pool;

import java.nio.channels.ServerSocketChannel;

public interface Boss {
	
	/**
	 * 加入一个新的ServerSocket
	 * @param serverChannel
	 */
	public void registerAcceptChannelTask(ServerSocketChannel serverChannel);
}
