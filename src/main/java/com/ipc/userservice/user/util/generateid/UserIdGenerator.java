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

public class UserIdGenerator implements IdentifierGenerator {

    /**
     * The Logger
     */
    final Logger logger = LoggerFactory.getLogger(UserIdGenerator.class);

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "userid";
        Connection connection = session.connection();

        try (Statement statement=connection.createStatement()){

            ResultSet rs=statement.executeQuery("select count(userid) as Id from users");

            if(rs.next())
            {
                int id=rs.getInt(1)+101;
                // +  new Integer(id).toString()
                String generatedId = prefix + Integer.toString(id) ;
                logger.info("Generated Id: {}", generatedId);
                return generatedId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
