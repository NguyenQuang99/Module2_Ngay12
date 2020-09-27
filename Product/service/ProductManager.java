package service;

import model.Product;

import java.util.*;

public class ProductManager implements IService<Product>  {
    static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1,"Nokia",500));
        products.add(new Product(2,"Redmi",2900));
        products.add(new Product(3,"SamSung",3500));
        products.add(new Product(4,"Iphone",7000));
        products.add(new Product(5,"Mac",12000));
    }



    @Override
    public void addProduct(Product object) {
        boolean flag = true;
        for(int i = 0; i<products.size(); i++) {
            if(object.getId() == products.get(i).getId()) {
                flag = true;
                break;

            }
        }
        if(flag)
            products.add(object);
    }

    @Override
    public void editProduct(Product newProduct) {
        if(isExisted(newProduct.getId())) {
            for(int i = 0; i < products.size(); i ++) {
                if(newProduct.getId() == products.get(i).getId()) {
                    products.set(i,newProduct);
                }
            }
        } else {
            System.out.printf("There are no products");
            System.out.println();
        }

    }

    @Override
    public void deleteProduct(int Id) {
        for(int i = 0;i < products.size(); i++) {
            if(Id == products.get(i).getId()) {
                products.remove(i);
            }
        }

    }

    @Override
    public List<Product> showProduct() {
        List<Product> productList = new ArrayList<>();
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            productList.add(iterator.next());
        }
        return productList;


    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> list = new ArrayList<>();
        for(int i = 0; i <products.size(); i ++) {
            if(name == products.get(i).getName()) {
                list.add(products.get(i));
            }
        }
        return list;
    }

    @Override
    public boolean isExisted(int Id) {
        for(Product product : products) {
            if(Id == product.getId()) {
                return true;
            }
        }
        return false;
    }
}
