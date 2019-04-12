package test.service;

import org.springframework.stereotype.Component;

/**
 * @author lenovo
 * @create 2019-04-12-13:42
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务发生故障";
    }
}
