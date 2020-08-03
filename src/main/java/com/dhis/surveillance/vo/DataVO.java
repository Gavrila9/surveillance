package com.dhis.surveillance.vo;

public class DataVO {
    private String name;
    private String province;
    private String city;
    private String status;
    private String longitude;
    private String latitude;
    private String confirmed_date;
    private String cure_date;
    private String death_date;
    private String sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStatus() {
        return status;
    }

    public String getConfirmed_date() {
        return confirmed_date;
    }

    public String getCure_date() {
        return cure_date;
    }

    public String getDeath_date() {
        return death_date;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setConfirmed_date(String confirmed_date) {
        this.confirmed_date = confirmed_date;
    }

    public void setCure_date(String cure_date) {
        this.cure_date = cure_date;
    }

    public void setDeath_date(String death_date) {
        this.death_date = death_date;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DataVO(String name, String province, String city, String status, String longitude, String latitude, String confirmed_date, String cure_date, String death_date, String sex, int age) {
        this.name = name;
        this.province = province;
        this.city = city;
        this.status = status;
        this.longitude = longitude;
        this.latitude = latitude;
        this.confirmed_date = confirmed_date;
        this.cure_date = cure_date;
        this.death_date = death_date;
        this.sex = sex;
        this.age = age;
    }
}
