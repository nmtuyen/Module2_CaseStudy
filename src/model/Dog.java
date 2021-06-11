package model;

public class Dog {
    private String id;
    private String dogBreed;
    private String source;
    private String classify;
    private int age;
    private double weigth;
    private int price;

    public Dog() {
    }

    public Dog(String id, String dogBreed, String source, String classify, int age, double weigth, int price) {
        this.id = id;
        this.dogBreed = dogBreed;
        this.source = source;
        this.classify = classify;
        this.age = age;
        this.weigth = weigth;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id='" + id + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", source='" + source + '\'' +
                ", classify='" + classify + '\'' +
                ", age='" + age + '\'' +
                ", weigth='" + weigth + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
