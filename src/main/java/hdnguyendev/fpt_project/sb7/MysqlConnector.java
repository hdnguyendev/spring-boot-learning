package hdnguyendev.fpt_project.sb7;

public class MysqlConnector extends DatabaseConnector{

    @Override
    public void connect() {
        System.out.println("Connected with Mysql: " + getUrl());
    }
}
