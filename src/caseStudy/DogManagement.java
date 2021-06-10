package caseStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DogManagement {
    private static ArrayList<Dog> dogArrayList;
    Bill bill = new Bill();


    public ArrayList<Dog> getDogArrayList() {
        return dogArrayList;
    }

    public void setDogArrayList(ArrayList<Dog> dogArrayList) {
        this.dogArrayList = dogArrayList;
    }

    public DogManagement() {
        dogArrayList = new ArrayList<>();
        dogArrayList.add(new Dog("123", "Alaska", "China", "chó kéo xe", "10-15", "30", "800"));
        dogArrayList.add(new Dog("123", "Pitbull", "American", "chó chọi", "18-13", "35", "1000"));
        dogArrayList.add(new Dog("456", "Mông Cộc", "Việt Nam", "chó giữ nhà", "18-14", "15", "300"));
        dogArrayList.add(new Dog("789", "Mông Cộc", "Việt Nam", "chó giữ nhà", "18-14", "17", "300"));
        dogArrayList.add(new Dog("234", "Alaska", "China", "chó kéo xe", "10-15", "30", "850"));
    }
    public void add(Dog dog){
        dogArrayList.add(dog);
    }
    public void display(ArrayList<Dog> dogArrayList){
        for (Dog dog : dogArrayList) {
            System.out.println(dog.toString());
        }
        System.out.println("---------------------------------------");
    }
    public int checkByID(String id){
        for (int i = 0; i < dogArrayList.size(); i++) {
            if (dogArrayList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public void edit(String id, Dog dog){
        int index = checkByID(id);
        if (index == -1){
            System.out.println("không có thông tin id chó cần sửa");
        }else
            dogArrayList.set(index, dog);
    }
    public void delete(String id){
        Scanner scanner = new Scanner(System.in);
        int index = checkByID(id);
        if (index == -1){
            System.out.println("không có thông tin chó cần xóa");
        }else{
            System.out.println("Xác nhận xóa: 1.Yes   2.No");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    dogArrayList.remove(index);
                    System.out.println("Đã xóa thành công");
                    break;
                case 2:
                    System.out.println("Đã hủy lệnh xóa");
                    break;
                default:
                    System.out.print("Mời nhập lại: ");
            }
        }
    }

    public void sortByDogBreed(){
        Collections.sort(dogArrayList, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getDogBreed().compareTo(o2.getDogBreed());
            }
        });
    }
    public void sellById(String id){
        ArrayList<Dog> listSellDog;
        int index = checkByID(id);
        if (index == -1 ){
            System.out.println("Chó bạn mua hiện không có");
        }else{

        }
    }
}
