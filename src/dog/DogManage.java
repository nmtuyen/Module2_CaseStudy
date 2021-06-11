package dog;

import manage.ManageDog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DogManage implements ManageDog {
    ArrayList<Dog> dogList;

    public DogManage() {
        dogList = new ArrayList<>();
    }
    public Dog input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin chó");
        System.out.println("Nhập ID chó: ");
        String id = scanner.nextLine();
        System.out.println("Nhập giống chó");
        String dogBreed = scanner.nextLine();
        System.out.println("Nhập nguồn gốc chó");
        String source = scanner.nextLine();
        System.out.println("Nhập loại chó");
        String classify = scanner.nextLine();
        System.out.println("Nhập tuổi chó");
        int age = scanner.nextInt();
        System.out.println("Nhập cân nặng chó");
        double weigth = scanner.nextDouble();
        System.out.println("Nhập giá chó");
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
            System.out.println("Không có thông tin chó cần xóa");
        }else{
            System.out.println("Xác nhận xóa: 1.Yes  2.No");
            System.out.print("Nhập lựa chọn:  ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    dogList.remove(index);
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
