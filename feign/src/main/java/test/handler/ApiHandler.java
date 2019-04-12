package test.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.service.ApiService;

import javax.annotation.Resource;

/**
 * @author lenovo
 * @create 2019-04-12-13:45
 */
@RestController
public class ApiHandler {
    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
