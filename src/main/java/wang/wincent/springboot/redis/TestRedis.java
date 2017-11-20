package wang.wincent.springboot.redis;

import java.util.HashSet;
import java.util.Set;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class TestRedis {
	
	public static void main(String[] args){
		Set<HostAndPort> nodes=new HashSet<HostAndPort>();
		nodes.add(new HostAndPort("192.168.100.244",6379));
		JedisCluster jc=new JedisCluster(nodes);
	}

}
