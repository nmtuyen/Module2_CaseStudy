package caseStudy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public void WriteFile(String pathFile, List<Dog> dogs) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//         public Dog(String id, String dogBreed, String source, String classify, String age, String weigth, String price)
        String str = "id,DogBreed,Source,Classify,Age,Weigth,Price\n";
        for (Dog dog : dogs){
            str += dog.getId()+","+ dog.getDogBreed()+","+dog.getSource()+","+dog.getClassify()+","+dog.getAge()+","+dog.getWeigth()+","+dog.getPrice()+"\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }
    public List<Dog> readFile(String pathFile) throws IOException {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine())!= null){
            System.out.println(line);
        }
        return null;
    }
}
