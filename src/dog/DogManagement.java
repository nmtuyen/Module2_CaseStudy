package dog;

import manage.ManageDog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DogManagement {
    private static ArrayList<Dog> dogArrayList;


    public ArrayList<Dog> getDogArrayList() {
        return dogArrayList;
    }

    public void setDogArrayList(ArrayList<Dog> dogArrayList) {
        this.dogArrayList = dogArrayList;
    }

    public DogManagement() {
        dogArrayList = new ArrayList<>();

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

    public int checkById(String id){
        for (int i = 0; i < dogArrayList.size(); i++) {
            if (dogArrayList.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public void edit(String id, Dog dog){
        int index = checkById(id);
        if (index == -1){
            System.out.println("không có thông tin id chó cần sửa");
        }else
            dogArrayList.set(index, dog);
    }
    public void sellById(String id){
        Scanner scanner = new Scanner(System.in);
        int index = checkById(id);
        if (index == -1){
            System.out.println("không có thông tin chó cần xóa");
        }else{
            System.out.println("Xác nhận xóa: 1.Yes   2.No");
            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    dogArrayList.remove(index);
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

    public void sortByDogBreed(){
        Collections.sort(dogArrayList, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getDogBreed().compareTo(o2.getDogBreed());
            }
        });
    }
//    public ArrayList<Dog> findById(String id){
//        ArrayList<caseStudy.Dog> arrayId =new ArrayList<>();
//        for (int i = 0; i < dogArrayList.size(); i++){
//            if (dogArrayList.get(i).getId().equals(id)){
//                arrayId.add(dogArrayList.get(i));
//            }
//        }
//        return arrayId;
//    }
    public Dog findById(String id){
        for(int i = 0; i < dogArrayList.size(); i++){
            if (dogArrayList.get(i).getId().equals(id)){
                return dogArrayList.get(i);
            }
        }
        return null;
    }
}
