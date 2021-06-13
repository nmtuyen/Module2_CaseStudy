package service;

import model.Bill;
import model.Dog;

import java.io.*;
import java.util.List;

public class ReadWriteBill {
    public void writeBill(String pathFile, List<Bill> bills) throws IOException {
        FileWriter fileWriterBill = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriterBill);
        String str = "id ,Name customer, Phone number, Date , Dog Infor ,Price\n";
        for (Bill bill : bills){
            str += bill.getId()+","+ bill.getNameCus()+","+bill.getPhoneNumber()+","+bill.getDate()+","+bill.getDogList()+"\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriterBill.close();
    }
    public List<Dog> readBill(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        return null;
    }
}
