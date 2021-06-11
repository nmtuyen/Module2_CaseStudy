package service;

import model.Bill;
import model.Dog;
import service.manage.ManageBill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BillManage implements ManageBill {
    private ArrayList<Bill> billArrayList;

    public BillManage(ArrayList<Bill> billArrayList) {
        this.billArrayList = billArrayList;
    }
    public BillManage() {

        billArrayList = new ArrayList<>();
//        billArrayList.add(new Bill("11062021", "Chương", "036594834", "11/06/2021", new Dog("213", "Pitull", "China", "Chó cảnh", 3, 15.5, 390), 390));
    }

    public ArrayList<Bill> getBillArrayList() {
        return billArrayList;
    }

    public void setBillArrayList(ArrayList<Bill> billArrayList) {
        this.billArrayList = billArrayList;
    }

    public int checkBillById(String id){
        for (int i = 0; i < billArrayList.size(); i++){
            if (billArrayList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void display(){
        for (int i = 0; i < billArrayList.size(); i++){
            System.out.println(billArrayList.get(i).toString());
        }
        System.out.println("=====================================");
    }

    @Override
    public void addBill(Bill bill){
        billArrayList.add(bill);
    }


    @Override
    public void sortBySales() {
        Collections.sort(billArrayList, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return o1.getSales()-o2.getSales();
            }
        });
    }


}
