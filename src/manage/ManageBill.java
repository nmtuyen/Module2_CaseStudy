package manage;

import bill.Bill;

public interface ManageBill {
    public void addBill(Bill bill);
    public void deleteBill(String id);
    public void sortBySales();
}
