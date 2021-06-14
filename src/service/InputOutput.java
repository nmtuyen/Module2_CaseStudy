package service;

import model.Account;
import model.Bill;

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

        String date;
        do {
            date = scanner.nextLine();
            if ((!Validate.validate(phoneNumber, Validate.DATE_REGEX) || date == null)){
                System.out.println("Sai định dạng, nhập lại điiiiiii");
            }
        }while ((!Validate.validate(phoneNumber, Validate.DATE_REGEX) || date == null));
        bill.setDate(date);

        return bill;
    }
    public Account inputAcc(){
        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        String user;
        System.out.println("Nhập tên tài khoản");
        do {
            user = sc.nextLine();
            if (!Validate.validate(user, Validate.NAME_CUSTOMER_REGEX) || user == null){
                System.out.println("Sai định dạng, nhập lại điiiiiii");
            }
        }while (!Validate.validate(user, Validate.NAME_CUSTOMER_REGEX) || user == null);
        account.setUser(user);

        String pass = sc.nextLine();
        account.setPass(pass);

        return account;
    }
}
