package service;

import model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManage {
    List<Account> accountList;

    public AccountManage(List<Account> accountList) {
        this.accountList = accountList;
    }

    public AccountManage() {
        accountList = new ArrayList<>();
        accountList.add(new Account("Tuyen", "123456"));
    }
    public int checkAccount(Account account){
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getUser().equals(account.getUser())){
                return i;
            }
        }
        return -1;
    }

    public void registration(Account account){
        int index = checkAccount(account);
        if (index != -1){
            System.out.println("Tài khoản đã tồn tại");
        }else{
            accountList.add(account);
            System.out.println("Đã đăng kí thành công");
        }
    }
    public void deleteAcc(Account account){
        int index = checkAccount(account);
        if (index != -1){
            accountList.remove(index);
        }else{
            System.out.println("Tài khoản không tồn tại");
        }
    }
}
