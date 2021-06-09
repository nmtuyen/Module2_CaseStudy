package caseStudy;

public class Dog {
    private String id;
    private String dogBreed;
    private String source;
    private String classify;
    private String age;
    private String weigth;
    private String price;

    public Dog() {
    }

    public Dog(String id, String dogBreed, String source, String classify, String age, String weigth, String price) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeigth() {
        return weigth;
    }

    public void setWeigth(String weigth) {
        this.weigth = weigth;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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
