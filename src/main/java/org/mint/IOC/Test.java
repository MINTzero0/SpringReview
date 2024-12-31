package org.mint;

/**
 * @author 薄荷
 * @create 2024-12-27 11:33
 **/

public class Test {
    public static void main(String[] args) {
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriverName("Driver");
        dataConfig.setUrl("localhost:3306/dbname");
        dataConfig.setUsername("mint");
        dataConfig.setPassword("040818");
    }
}
