package com.shadyboshra2012.android.udacitytourguideappproject.objects;

public class Location {
    private String name;
    private String address;
    private String phone;
    private String image;

    public Location() {
    }

    public Location(String name, String address, String phone, String image) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
