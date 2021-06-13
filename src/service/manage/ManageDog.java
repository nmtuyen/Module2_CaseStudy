package service.manage;

import model.Dog;

public interface ManageDog{
    int checkById(String id);
    void add(Dog dog);
    void editById(String id);
    void delete(String id);
    Dog sellDog(String id);

}
