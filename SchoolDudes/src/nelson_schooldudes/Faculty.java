/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelson_schooldudes;

/**
 *
 * @author david
 */
public class Faculty extends CollegeEmployee {

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }

   
    boolean tenured;

    @Override
    public String displayAll(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber) {
        return super.displayAll(firstName, lastName, streetAddress, zipCode, phoneNumber); //To change body of generated methods, choose Tools | Templates.
    }
    
}
