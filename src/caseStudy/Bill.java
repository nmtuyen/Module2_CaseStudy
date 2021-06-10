package caseStudy;

import java.util.ArrayList;
import java.util.Date;

public class Bill {
    private String id;
    private String nameCus;
    private String nb;
    private ArrayList<Dog> listDog;
    private int sales;

    public Bill(String id, String nameCus, String nb) {
        this.id = id;
        this.nameCus = nameCus;
        this.nb = nb;
        this.listDog = new ArrayList<>();
    }

    public Bill() {
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

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public ArrayList<Dog> getBillList() {
        return listDog;
    }

    public void setBillList(ArrayList<Dog> billList) {
        this.listDog = billList;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", nameCus='" + nameCus + '\'' +
                ", nb=" + nb +
                ", billList=" + listDog +
                ", sales=" + sales +
                '}';
    }
}
