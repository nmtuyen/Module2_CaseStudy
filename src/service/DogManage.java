package service;

import model.Dog;
import service.manage.ManageDog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DogManage implements ManageDog {
    private ArrayList<Dog> dogList;

    public ArrayList<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(ArrayList<Dog> dogList) {
        this.dogList = dogList;
    }

    public DogManage() {
        dogList = new ArrayList<>();

        dogList.add(new Dog("Alaska1", "Alaska", "China", "chó kéo xe", 3, 40.5, 800));
        dogList.add(new Dog("Pitbull1", "Pitbull", "Mĩ", "chó chọi", 3, 35, 900));
        dogList.add(new Dog("Phoc1", "Phốc", "Pháp", "chó cảnh", 2, 5.5, 700));
        dogList.add(new Dog("Becgie1", "Becgie", "Đức", "chó giữ nhà", 4, 50.5, 300));
        dogList.add(new Dog("Alaska2", "Alaska", "China", "chó kéo xe", 5, 39.5, 450));
    }
    public Dog input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin pet");
        System.out.print("Nhập ID chó: ");
        String id = scanner.nextLine();
        System.out.print("Nhập giống pet: ");
        String dogBreed = scanner.nextLine();
        System.out.print("Nhập nguồn gốc pet: ");
        String source = scanner.nextLine();
        System.out.print("Nhập loại pet: ");
        String classify = scanner.nextLine();
        System.out.print("Nhập tuổi pet: ");
        int age = scanner.nextInt();
        System.out.print("Nhập cân nặng pet: ");
        double weigth = scanner.nextDouble();
        System.out.print("Nhập giá pet: ");
        int price = scanner.nextInt();
        return new Dog(id, dogBreed, source, classify, age, weigth, price);
    }
    public void display(){
        for (int i = 0; i < dogList.size(); i++){
            System.out.println(dogList.get(i).toString());
        }
    }

    @Override
    public int checkById(String id) {
        for(int i = 0; i < dogList.size(); i++){
            if (dogList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public void add(Dog dog) {
        dogList.add(dog);
    }

    @Override
    public void editById(String id) {
        int index = checkById(id);
        if (index == -1){
            System.out.println("Không có thông tin chó cần sửa");
        }else
            dogList.set(index, input());
    }

    @Override
    public void delete(String id) {
        Scanner scanner = new Scanner(System.in);
        int index = checkById(id);
        if (index == -1){
            System.out.println("Pet này đã hết");
        }else{
            System.out.println("Xác nhận bán: 1.Yes  2.No");
            System.out.print("Nhập lựa chọn:  ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    dogList.remove(index);
                    System.out.println("Đã bán thành công");
                    break;
                case 2:
                    System.out.println("Đã hủy lệnh bán");
                    break;
                default:
                    System.out.print("Mời nhập lại: ");
            }
        }
    }

    @Override
    public Dog sellDog(String id) {
        Scanner sc = new Scanner(System.in);
        int index = checkById(id);
        if (index == -1){
            System.out.println("Không có thông tin chó cần bán");
        }else{
            System.out.println("Xác nhận bán: 1.Yes  2.No");
            System.out.print("Nhập lựa chọn:  ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Đã hoàn thành bán");
                    return dogList.get(index);
                case 2:
                    System.out.println("Đã hủy lệnh bán");
                    break;
                default:
                    System.out.print("Mời nhập lại: ");
            }
        }
        return null;
    }
    public void sortByDogBreed(){
        Collections.sort(dogList, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getDogBreed().compareTo(o2.getDogBreed());
            }
        });
    }
    public void sortByPrice(){
        Collections.sort(dogList, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }
    public ArrayList<Dog> findById(String id){
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < dogList.size(); i++){
            if (dogList.get(i).getId().equals(id)){
                dogs.add(dogList.get(i));
            }
        }
        return dogs;
    }
    public ArrayList<Dog> findByPrice(int minPrice, int maxPrice){
        ArrayList<Dog> dogsPrice = new ArrayList<>();
        if(minPrice>=maxPrice){
            System.out.println("Khoảng giá không hợp lệ");
        }else
            for (int i = 0; i < dogList.size(); i++){
                if (dogList.get(i).getPrice()>minPrice && dogList.get(i).getPrice() <= maxPrice){
                    dogsPrice.add(dogList.get(i));
                }
            }
        return dogsPrice;
    }
    public ArrayList<Dog> findByDogBreed(String dogBreed){
        ArrayList<Dog> dogsBreed = new ArrayList<>();
        for (int i = 0; i < dogList.size(); i++){
            if (dogList.get(i).getDogBreed().equals(dogBreed)) dogsBreed.add(dogList.get(i));
        }
        return dogsBreed;
    }
}
