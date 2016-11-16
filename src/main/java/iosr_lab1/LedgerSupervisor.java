package iosr_lab1;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class LedgerSupervisor
{
    public static void main( String[] args )
    {

        Jedis jedis = new Jedis("redis1.mapu.usermd.net", 9000);
        System.out.println("Connected to Redis");

        //System.out.println( "Hello World!" );

        //System.out.println("2");
    }
}
