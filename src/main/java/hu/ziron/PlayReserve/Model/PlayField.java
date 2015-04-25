package hu.ziron.PlayReserve.Model;

import javax.persistence.GeneratedValue;

/**
 * Created by Tamas on 2015.04.25..
 */
public class PlayField {
    @GeneratedValue
    int id;
    public String street;
    public String number;
    public String district;
    public String city;
    public String name;
    public String postCode;

    public PlayField(String street, String number, String district, String city, String name, String postCode) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
        this.name = name;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public PlayField() {

    }
}
