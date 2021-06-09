package caseStudy;

import java.util.List;

public class Bill {
    private String idBill;
    private String nb;
    private List<Dog> dogList;
    private int sale;

    public Bill(String idBill, String nb, List<Dog> dogList, int sale) {
        this.idBill = idBill;
        this.nb = nb;
        this.dogList = dogList;
        this.sale = sale;
    }

    public Bill() {
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idBill='" + idBill + '\'' +
                ", nb='" + nb + '\'' +
                ", dogList=" + dogList +
                ", sale=" + sale +
                '}';
    }
}
