package hu.ziron.PlayReserve.Model;

public class PlayFieldBuilder {
    private String street = "N / A";
    private String number = "N / A";
    private String district = "N / A";
    private String city = "N / A";
    private String name = "N / A";
    private String postCode = "N / A";

    public PlayFieldBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public PlayFieldBuilder setNumber(String number) {
        this.number = number;
        return this;
    }

    public PlayFieldBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public PlayFieldBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PlayFieldBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayFieldBuilder setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public PlayField createPlayField() {
        return new PlayField(street, number, district, city, name, postCode);
    }
}