package model;

import java.time.LocalDate;

public class Person {
    private String title;
    private String forename;
    private String surname;
    private String formerName;
    private String country;
    private String nationality;
    private LocalDate dob;
    private String occupation;
    private Address address;
    public Person (String title, String forename, String surname, String formerName,
                   String country,String nationality, LocalDate dob, String occupation,Address address){
        this.title= title;
        this.forename = forename;
        this.surname = surname;
        this.formerName = formerName;
        this.country = country;
        this.nationality = nationality;
        this.dob = dob;
        this.occupation = occupation;
        this.address = address;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        if (forename.matches(".*\\d.*")){
           throw new RuntimeException();
        }
        else {
            this.forename = forename;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "model.Person: " +
                "title='" + title + "'" +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", formerName='" + formerName + '\'' +
                ", country='" + country + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dob=" + dob +
                ", occupation='" + occupation + '\'' +
                ", address='" + address + '\'';

    }
}

