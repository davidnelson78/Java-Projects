/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_relativity.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import nelson_relativity.dao.AstronautDaoImpl;

/**
 *
 * @author david
 */
public class Nelson_Relativity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:derby:/opt/db-derby-10.14.1.0/relativity;create=true");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE Astronaut (AstroFName VARCHAR(24), AstroLName VARCHAR(24), ApolloMissionNumber INT(12), YearOfMission INT(12),)");
            System.out.println("Created Table");

            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('Neil', 'Armstrong', 11, 1969),('Michael', 'Collins', 11, 1969),('Edwin', 'Aldrin', 11, 1969)");
            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('Charles', 'Conrad', 12, 1969),('Richard', 'Gordon', 12, 1969),('Alan', 'Bean', 12, 1969)");
            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('Alan', 'Shepard', 14, 1971),('Stuart', 'Roosa', 14, 1971),('Edgar', 'Mitchell', 14, 1971)");
            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('David', 'Scott', 15, 1971),('Alfred, 'Worden', 15, 1971),('James', 'Irwin', 15, 1971)");
            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('John', 'Young', 16, 1972),('Thomas, 'Mattingly', 16, 1972),('Charles', 'Duke', 16, 1972)");
            stmt.executeUpdate("INSERT INTO Astronaut VALUES ('Eugene', 'Cernan', 17, 1972),('Ronald, 'Evans', 17, 1972),('Harrison', 'Schmitt', 17, 1972)");

            System.out.println("Populated Table");
            System.out.println("Done");

        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e.toString());
        }

        AstronautDaoImpl dao = new AstronautDaoImpl();
        ArrayList<Astronaut> astronaut = dao.getAstronauts();
        for (Astronaut a : astronaut) {
            System.out.println("Astronaut Name: " + a.getAstroFName() + " " + a.getAstroLName());
            System.out.println("Apollo Mission Number: " + a.getApolloMissionNumber());
            System.out.println("Apollo Mission Year: " + a.getYearOfMission());

        }

        try {
            Connection con = DriverManager.getConnection("jdbc:derby:/opt/db-derby-10.14.1.0/relativity;create=true");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("DROP TABLE Astronaut");
            System.out.println("Table Dropped");

        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e.toString());
        }

    }

}
