package org.mint.IOC;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 薄荷
 * @create 2024-12-27 11:26
 **/
@Data
@Component//  相当于隔壁BeanConfiguration下面dataConfig下的代码都有了
public class DataConfig {
    @Value("localhost:3306")
    private String url;
    @Value("Driver")
    private String driverName;
    @Value("root")
    private String username;
    @Value("root")
    private String password;

}
