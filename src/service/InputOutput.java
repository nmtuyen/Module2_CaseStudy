package service;

import model.Bill;
import model.Dog;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class InputOutput {
    public Bill inputBill(){
        Bill bill = new Bill();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng: ");
        String nameCus;
        do {
            nameCus = scanner.nextLine();
            if ((!Validate.validate(nameCus, Validate.NAME_CUSTOMER_REGEX)|| nameCus == null)){
                System.out.println("Sai định dạng, nhập lại điiiiiii");
            }
        }while ((!Validate.validate(nameCus, Validate.NAME_CUSTOMER_REGEX)|| nameCus == null));
        bill.setNameCus(nameCus);
        System.out.print("Nhập số điện thoại khách hàng: ");
        String phoneNumber;
        do {
            phoneNumber = scanner.nextLine();
            if ((!Validate.validate(phoneNumber, Validate.PHONE_NUMBER_REGEX) || phoneNumber == null)){
                System.out.println("Sai định dạng, nhập lại điiiiiii");
            }
        }while ((!Validate.validate(phoneNumber, Validate.PHONE_NUMBER_REGEX) || phoneNumber == null));
        bill.setPhoneNumber(phoneNumber);
        System.out.print("Nhập ngày bán: ");
        String date = scanner.nextLine();
        bill.setDate(date);

        return bill;
    }
}
