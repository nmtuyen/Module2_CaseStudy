package bill;

import dog.Dog;
import manage.ManageBill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BillManage implements ManageBill {
    ArrayList<Bill> billArrayList;

    public BillManage(ArrayList<Bill> billArrayList) {
        this.billArrayList = billArrayList;
    }
    public BillManage() {
        billArrayList = new ArrayList<>();
    }

    public int checkBillById(String id){
        for (int i = 0; i < billArrayList.size(); i++){
            if (billArrayList.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public void addBill(Bill bill){
        billArrayList.add(bill);
    }

    @Override
    public void deleteBill(String id) {
        Scanner sc = new Scanner(System.in);
        int index = checkBillById(id);
        if (index == -1){
            System.out.println("Không có hóa đơn cần sửa");
        }else {
            System.out.println("Xác nhận xóa:   1.Có   2.Không");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    billArrayList.remove(index);
                    System.out.println("Đã xóa thành công!");
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
    public void sortBySales() {
        Collections.sort(billArrayList, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                return o1.getSales()-o2.getSales();
            }
        });
    }


}
