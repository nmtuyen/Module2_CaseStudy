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
        billArrayList.add(new Bill("11062021", "Chương", "036594834", "11/06/2021"));
        billArrayList.add(new Bill("13062021", "Phong", "036665151", "13/06/2021"));
        billArrayList.add(new Bill("15062021", "Chiến", "036565654", "15/06/2021"));
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
    public int findBillMax(String id){
        int maxSales = billArrayList.get(0).getSales();
        for (int i = 1; i < billArrayList.size(); i++){
            if (billArrayList.get(i).getSales()>maxSales){
                maxSales = billArrayList.get(i).getSales();
            }
        }
        return maxSales;
    }


}
