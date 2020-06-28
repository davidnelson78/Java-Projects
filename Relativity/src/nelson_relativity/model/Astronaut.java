/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_relativity.model;

/**
 *
 * @author david
 */
public class Astronaut {

    private String astroFName;
    private String astroLName;
    private int apolloMissionNumber;
    private int yearOfMission;

    public String getAstroFName() {
        return astroFName;
    }

    public void setAstroFName(String astroFName) {
        this.astroFName = astroFName;
    }

    public String getAstroLName() {
        return astroLName;
    }

    public void setAstroLName(String astroLName) {
        this.astroLName = astroLName;
    }

    public int getApolloMissionNumber() {
        return apolloMissionNumber;
    }

    public void setApolloMissionNumber(int apolloMissionNumber) {
        this.apolloMissionNumber = apolloMissionNumber;
    }

    public int getYearOfMission() {
        return yearOfMission;
    }

    public void setYearOfMission(int yearOfMission) {
        this.yearOfMission = yearOfMission;
    }

}
