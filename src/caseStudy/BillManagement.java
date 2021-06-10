package caseStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class BillManagement {
    public ArrayList<Bill> billArrayList;
    DogManagement dogManagement = new DogManagement();

    public BillManagement(ArrayList<Bill> billArrayList) {
        this.billArrayList = billArrayList;
    }

    public BillManagement() {
    }
    public void add(){

    }
    public void printBill(){
    }
    public Bill inputInformationBill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin hóa đơn");
        System.out.println("Nhập id hóa đơn");
        String idBill = scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
        String nameCus = scanner.nextLine();
        System.out.println("Nhập ngày bán(dd/mm/yyyy): ");
        String nb = scanner.nextLine();
        System.out.println("Nhập id chó cần bán");
        String id = scanner.nextLine();
        Dog dog = dogManagement.findById(id);
        int sales = dog.getPrice();
        return new Bill(idBill, nameCus, nb, dog, )
    }

}
