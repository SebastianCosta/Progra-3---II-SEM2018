
package triptec.logic;

import triptec.structures.ControladorGrafo;


public class Client {
     private int ID,PhoneNumber;
     private String name,email,birthdate;
     private ControladorGrafo places;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public ControladorGrafo getPlaces() {
        return places;
    }

    public void setPlaces(ControladorGrafo places) {
        this.places = places;
    }

    public Client(int ID, int PhoneNumber, String name, String email, String birthdate) {
        this.ID = ID;
        this.PhoneNumber = PhoneNumber;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.places = new ControladorGrafo();
    }
     
     
    
}
