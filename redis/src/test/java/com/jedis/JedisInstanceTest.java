package com.jedis;

import org.junit.Test;

import com.JedisInstance;

import redis.clients.jedis.Jedis;

public class JedisInstanceTest {

    /**
     * 基本使用
     */
    @Test
    public void test() {
        Jedis jedis = JedisInstance.getInstance().getResource();
        jedis.setex("name1", 30, "test");
        String val = jedis.get("name1");
        System.out.println(val);
    }

}
