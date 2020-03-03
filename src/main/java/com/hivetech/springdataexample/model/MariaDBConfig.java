package com.hivetech.springdataexample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Configuration;

@Getter @Setter @ToString
public class MariaDBConfig {
    private Welcome welcome;
    private DatabaseProperties databaseProperties;

    //Inner class
    @Getter @Setter @ToString
    class Welcome {
        private String des;
    }
    @Getter @Setter @ToString
    class DatabaseProperties {
        private String dbUrl;
        private String dbPw;
        private String dbUser;
        private String dbDriver;
    }
    //---

}
