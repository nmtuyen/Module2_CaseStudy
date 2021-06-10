package caseStudy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static String LIST_DOG = "ListDog.csv";
    public static void main(String[] args) throws IOException {
        DogManagement dogManagement = new DogManagement();
        dogManagement.add(new Dog("123", "Alaska", "China", "chó kéo xe", 3, 30.5, 800));
        dogManagement.add(new Dog("564", "Pitbull", "Mĩ", "chó chọi", 3, 35.5, 900));
        dogManagement.add(new Dog("321", "Phốc", "Pháp", "chó cảnh", 2, 30.5, 800));
        dogManagement.add(new Dog("679", "Begie", "Đức", "chó giữ nhà", 4, 30.5, 800));
        dogManagement.add(new Dog("564", "Alaska", "China", "chó kéo xe", 5, 30.5, 800));
        Bill bill = new Bill();
        dogManagement.display(dogManagement.getDogArrayList());
        dogManagement.sellById("123");



    }
    public void menu(){
        System.out.println("==========Menu==========");
        System.out.println("1. Thêm 1 con chó");
        System.out.println("2. Hiển thị list chó");
        System.out.println("3. Cập nhật thông tin chó");
        System.out.println("4. Bán chó và in hóa đơn");
        System.out.println("5. Tìm kiếm chó theo id");
        System.out.println("6. Sắp xếp list chó theo xuất xứ");
        System.out.println("0. Thoát chương trình");
    }
}
