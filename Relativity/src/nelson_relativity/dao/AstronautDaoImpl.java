/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_relativity.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import nelson_relativity.model.Astronaut;

/**
 *
 * @author david
 */
public class AstronautDaoImpl implements AstronautDao {

    @Override
    public ArrayList<Astronaut> getAstronauts() {

        Connection conn = null;
        ResultSet rs = null;
        Statement statement = null;
        ArrayList<Astronaut> astronauts = new ArrayList<>();

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            conn = DriverManager.getConnection("jdbc:derby:/opt/db-derby-10.14.1.0/relativity");
            statement = conn.createStatement();
            rs = statement.executeQuery("select * from astronaut");

            Astronaut astronaut;
            while (rs.next()) {
                astronaut = new Astronaut();
                astronaut.setAstroFName(rs.getString(2));
                astronaut.setAstroLName(rs.getString(2));
                astronaut.setApolloMissionNumber(rs.getInt(2));
                astronaut.setYearOfMission(rs.getInt(2));
                astronauts.add(astronaut);
            }

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AstronautDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(AstronautDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return astronauts;
    }

}
