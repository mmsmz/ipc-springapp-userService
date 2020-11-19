package com.ipc.userservice.user.util.generateid;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CoursePriceIdGenerator implements IdentifierGenerator {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(CoursePriceIdGenerator.class);

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "crsprid";
        Connection connection = session.connection();

        try (Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery("select count(crsprid) as Id from courseprice");

            if (rs.next()) {
                int id = rs.getInt(1) + 01;
                String generatedId = prefix + Integer.toString(id);
                logger.info("Generated Id: {}", generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}