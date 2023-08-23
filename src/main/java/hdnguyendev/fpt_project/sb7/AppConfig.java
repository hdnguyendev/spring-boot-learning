package hdnguyendev.fpt_project.sb7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mysqlConfigure()
    {
        DatabaseConnector mysqlConnector = new MysqlConnector();
        System.out.println("Config Mysql Url: " + mysqlUrl);
        mysqlConnector.setUrl(mysqlUrl);

        return mysqlConnector;
    }
}
