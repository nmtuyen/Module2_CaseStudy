import bill.Bill;
import bill.BillManage;
import dog.Dog;
import dog.DogManage;
import dog.DogManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static String LIST_DOG = "ListDog.csv";
    public static void main(String[] args) throws IOException {
        DogManagement dogManagement = new DogManagement();
        BillManage billManage = new BillManage();
        DogManage dogManage = new DogManage();
        dogManage.add(new Dog("123", "Alaska", "China", "chó kéo xe", 3, 30.5, 800));
        dogManage.add(new Dog("564", "Pitbull", "Mĩ", "chó chọi", 3, 35.5, 900));
        dogManage.add(new Dog("321", "Phốc", "Pháp", "chó cảnh", 2, 30.5, 800));
        dogManage.add(new Dog("679", "Begie", "Đức", "chó giữ nhà", 4, 30.5, 800));
        dogManage.add(new Dog("564", "Alaska", "China", "chó kéo xe", 5, 30.5, 800));

        dogManagement.display(dogManagement.getDogArrayList());

        billManage.addBill(new Bill("2313", "Tuyền", "10/03/2021", new Dog("123", "Alaska", "China", "chó kéo xe", 3, 30.5, 800), 800));
        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin pet muốn thêm");
                    dogManage.add(dogManage.input());
                    break;
                case 2:
                    dogManage.display();
                    break;
                case 3:
                    System.out.println("Nhập id chó cần sửa");
                    String id = scanner.nextLine();
                    dogManage.editById(id);
                    break;
                case 4:
                    System.out.println("Nhập lựa chọn tìm kiếm: 1.Tìm theo id   2.Tìm theo khoảng giá   3.Tìm theo giống");
                    int choice2 = scanner.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.print("Nhập Id pet cần tìm: ");
                            String idFind = scanner.nextLine();
                            dogManage.findById(idFind);
                            break;
                        case 2:
                            System.out.println("Nhập khoảng giá cần tìm kiếm");
                            System.out.print("Nhập giá thấp nhất: ");
                            int min = scanner.nextInt();
                            System.out.print("Nhập giá cao nhất: ");
                            int max = scanner.nextInt();
                            dogManage.findByPrice(min, max);
                            break;
                        case 3:
                            System.out.println("Nhập giống pet cần tìm: ");
                            String dogBreed = scanner.nextLine();
                            dogManage.findByDogBreed(dogBreed);
                            break;
                        default:
                            System.out.println("Mời nhập lại");
                    }
                case 5:
                    System.out.println("Sắp xếp pet: 1.Sắp xếp theo giá    3.Sắp xếp theo nguồn gốc");
                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                            dogManage.sortByPrice();
                            break;
                        case 2:
                            dogManage.sortByDogBreed();
                            break;
                        default:
                            System.out.println("Mời nhập lại");
                    }
                case 6:
                    System.out.println("Nhập id pet cần bán");
                    String idSell = scanner.nextLine();
                    billManage.addBill();

            }
        }
    }
    public static void menu(){
        System.out.println("======HỆ THỐNG QUẢN LÝ THÚ CƯNG======");
        System.out.println("1. Thêm mới");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Sửa thông tin");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Sắp xếp danh sách theo xuất xứ");
        System.out.println("6. Bán");
        System.out.println("0. Thoát chương trình");
    }
}
