package view;

import model.*;
import service.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static String LIST_DOG = "ListDog.csv";
    public static String LIST_BILL = "ListBill.csv";
    public static void main(String[] args) throws IOException {
        BillManage billManage = new BillManage();
        DogManage dogManage = new DogManage();
        ReadWriteFile readWriteFile = new ReadWriteFile();
        ReadWriteBill readWriteBill = new ReadWriteBill();
        InputOutput inputOutput = new InputOutput();


        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin pet muốn thêm");
                    dogManage.add(dogManage.input());
                    readWriteFile.writeFile(LIST_DOG,dogManage.getDogList());
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
                    scanner.nextLine();
                    switch (choice2){
                        case 1:
                            System.out.print("Nhập Id pet cần tìm: ");
                            String idFind = scanner.nextLine();
                            scanner.nextLine();
                            for (int i = 0; i < dogManage.findById(idFind).size(); i++){
                                System.out.println(dogManage.findById(idFind).get(i));
                        }
                            break;
                        case 2:
                            System.out.println("Nhập khoảng giá cần tìm kiếm");
                            System.out.print("Nhập giá thấp nhất: ");
                            int min = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nhập giá cao nhất: ");
                            int max = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < dogManage.findByPrice(min, max).size(); i++){
                                System.out.println(dogManage.findByPrice(min, max).get(i));
                            }
                            break;
                        case 3:
                            System.out.println("Nhập giống pet cần tìm: ");
                            String dogBreed = scanner.nextLine();
                            for (int i = 0; i <dogManage.findByDogBreed(dogBreed).size(); i++ ){
                                System.out.println(dogManage.findByDogBreed(dogBreed).get(i).toString());
                            }
                            break;
                        default:
                            System.out.println("Mời nhập lại");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Sắp xếp pet: 1.Sắp xếp theo giá    2.Sắp xếp theo nguồn gốc");
                    int select = scanner.nextInt();
                    switch (select){
                        case 1:
                            dogManage.sortByPrice();
                            dogManage.display();
                            break;
                        case 2:
                            dogManage.sortByDogBreed();
                            dogManage.display();
                            break;
                        default:
                            System.out.println("Mời nhập lại");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Nhập id pet muốn bán");
                    String idPetSell = scanner.nextLine();
                    Dog dogSell = dogManage.sellDog(idPetSell);
                    Bill bill = new Bill();
                    System.out.println("Nhập id bill");
                    String idBill = scanner.nextLine();
                    bill.setId(idBill);
                    bill = inputOutput.inputBill();
                    bill.setDog(dogSell);
                    bill.setSales(dogSell.getPrice());
                    billManage.addBill(bill);
                    billManage.display();
                    readWriteBill.writeBill(LIST_BILL, billManage.getBillArrayList());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
    public static void menu(){
        System.out.println("======HỆ THỐNG QUẢN LÝ THÚ CƯNG======");
        System.out.println("1. Thêm mới");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Sửa thông tin");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Sắp xếp theo xuất xứ");
        System.out.println("6. Bán");
        System.out.println("0. Thoát chương trình");
    }
}