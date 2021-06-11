package service.manage;

import model.Dog;

public interface ManageDog {
    public int checkById(String id);
    public void add(Dog dog);
    public void editById(String id);
    public void delete(String id);
    public Dog sellDog(String id);

}
