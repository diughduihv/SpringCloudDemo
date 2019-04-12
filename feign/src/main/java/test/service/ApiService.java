package test.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lenovo
 * @create 2019-04-11-16:21
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    String index();
}
