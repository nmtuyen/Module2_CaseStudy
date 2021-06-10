package caseStudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static String LIST_DOG = "ListDog.csv";
    public static void main(String[] args) throws IOException {

//        DogManagement dogManagement = new DogManagement();
//        ReadWriteFile readWriteFile = new ReadWriteFile();
//        Bill bill = new Bill();
//        bill.bill1.toString();
        Bill bill = new Bill("123", "Tuyen", "06/06/2021");
        Bill bill2 = new Bill("465", "phong", "06/06/2021");
        System.out.println(bill);
        bill.getBillList().add(new Dog("234", "Alaska", "China", "chó kéo xe", "10-15", "30", "850"));
        bill.getBillList().add(new Dog("234", "pitbull", "China", "chó chọi", "10-15", "30", "850"));
        System.out.println(bill);
        System.out.println(bill2);
    }
}
