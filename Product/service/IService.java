package service;

import java.util.List;

public interface IService<T> {

    void addProduct( T object);
    void editProduct(T object);
    void deleteProduct( int Id);
    List<T> showProduct();
    List<T> searchProduct(String name);
    boolean isExisted(int Id);
}
