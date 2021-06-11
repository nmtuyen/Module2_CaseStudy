package model;

public class Bill implements{
    private String id;
    private String nameCus;
    private String phoneNumber;
    private String date;
    private Dog dog;
    private int sales;

    public Bill() {
    }

    public Bill(String id, String nameCus, String phoneNumber, String date, int sales) {
        this.id = id;
        this.nameCus = nameCus;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.sales = sales;
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

    public Dog getDog(Dog dogSell) {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public int getSales() {
        return dog.getPrice();
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +'\n'+
                ", nameCus='" + nameCus + '\'' +'\n'+
                ", phoneNumber='" + phoneNumber + '\'' +'\n'+
                ", date='" + date + '\'' +'\n'+
                ", dog=" + dog +'\n'+
                ", sales=" + dog.getPrice() +
                '}';
    }

}
