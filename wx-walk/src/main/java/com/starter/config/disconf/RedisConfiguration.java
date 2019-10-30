package com.starter.config.disconf;

import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;

@Configuration
@DisconfFile(filename = "redis.properties")
public class RedisConfiguration {

	private String host;

	private String port;
	@DisconfFileItem(name = "redis.host", associateField = "host")
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	@DisconfFileItem(name = "redis.port", associateField = "port")
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	
}
