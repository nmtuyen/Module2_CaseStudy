package bill;

import dog.Dog;

public class Bill {
    private String id;
    private String nameCus;
    private String date;
    private Dog dog;
    private int sales;

    public Bill() {
    }

    public Bill(String id, String nameCus, String date, Dog dog, int sales) {
        this.id = id;
        this.nameCus = nameCus;
        this.date = date;
        this.dog = dog;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Dog getDog() {
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
                "id='" + id + '\'' +
                ", nameCus='" + nameCus + '\'' +
                ", date='" + date + '\'' +
                ", dog=" + dog +
                ", sales=" + dog.getPrice() +
                '}';
    }
}
