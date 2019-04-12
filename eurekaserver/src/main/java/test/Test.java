package test;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lenovo
 * @create 2019-04-07-15:34
 */
@SpringCloudApplication
@EnableEurekaServer
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
