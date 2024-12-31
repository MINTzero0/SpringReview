package org.mint.configuration;

import org.mint.IOC.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 薄荷
 * @create 2024-12-27 16:43
 **/
@Configuration
public class BeanConfiguration {
    @Bean(value = "data")
    public DataConfig dataConfig(){
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriverName("Driver");
        dataConfig.setUrl("localhost:3306/dbname");
        dataConfig.setUsername("mint");
        dataConfig.setPassword("040818");
        return dataConfig;
    }
}
