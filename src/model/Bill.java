package model;

import service.DogManage;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    private String id;
    private String nameCus;
    private String phoneNumber;
    private String date;
    private List<Dog> dogList;
    private int sales;

    public Bill() {
    }

    public Bill(String id, String nameCus, String phoneNumber, String date) {
        this.id = id;
        this.nameCus = nameCus;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.dogList = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public int getSales() {
        return sales;
    }

    public void setSales() {
        for (int i = 0; i < dogList.size(); i++) {
            this.sales += dogList.get(i).getPrice();
        }

    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + "\n" +
                ", nameCus='" + nameCus + "\n" +
                ", phoneNumber='" + phoneNumber + "\n" +
                ", date='" + date + "\n" +
                ", dogList=" + dogList+ "\n" +
                ", sales=" + sales + "\n" +
                '}';
    }
}
