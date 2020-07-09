package redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Description
 * @Author sw
 * @Date 2020/04/14 10:21
 **/
@Configuration
@ComponentScan(basePackages = "redis.*")
public class redisConfig {
   // @Value(redis="")
    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory getFactory() {
        return new JedisConnectionFactory();
    }

    @Bean(name = "redisTemplate")
    public RedisTemplate getTemplate(){
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(getFactory());
        return redisTemplate;
    }

}
