package com.todc.openwack;


import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
@Component
public class DatabaseMigrator implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Override
    public void run(String... strings) throws Exception {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource(dataSource);

        // Start the migration
        flyway.migrate();
    }

}
