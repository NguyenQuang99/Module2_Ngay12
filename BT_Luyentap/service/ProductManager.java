package BT_Luyentap;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManager  {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList;
    public ProductManager() {
        productList = new LinkedList<>();

    }
    public static void showMenu() {
        System.out.printf("Menu");
        System.out.printf("1.Add Product");
        System.out.printf("2.Edit product");
        System.out.printf("3.Delete");
        System.out.printf("4.Show Product");
        System.out.printf("5.Search Product");
        System.out.printf("0.Exit");
        System.out.printf("////////////////");
        System.out.printf("////////////////");
        System.out.printf("////////////////");
        System.out.printf("Choice :");


    }
    public void addProduct() {
        System.out.printf("Enter Id :");
        int idProduct = scanner.nextInt();
        System.out.printf("Enter name :");
        String nameProduct = scanner.next();
        System.out.println("Enter price :");
        int priceProduct = scanner.nextInt();
        Product product = new Product(idProduct,nameProduct,priceProduct);
        productList.add(product);

    }
    public void showProduct() {
        for(Product product : productList) {
            System.out.println(product);
        }
        System.out.println();

    }
    public void delete() {
        System.out.println("Nhap vao can xoa");
        int id = scanner.nextInt();
        Product product = null;
        for(int i = 0; i < productList.size(); i++ ) {
            if(productList.get(i).getId() == id) {
                product = productList.get(i);
                break;
            }
        }
        if(product != null) {
            productList.remove(product);
        } else {
            System.out.println("khong the xoa");
        }
    }
    public void searchProduct() {
        System.out.println("Nhap vao :");
        String name = scanner.next();
        boolean check = false;
        int i;
        for( i = 0; i< productList.size(); i++) {
            if(name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i).toString());
                check = true;
            }
        }
        if(!check) {
            System.out.println("Khong the ");
        }
    }


    }
    public void editProduce() {
        Product produce = null;
        boolean check = false;
        while (!check) {
            System.out.printf("Enter Id : ");
            int id = scanner.nextInt();
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    produce = productList.get(i);
                    check = true;
                }
            }
            if (!check)
                System.out.println("Id wrong ! Try again ");
        }
        if (check) {
            System.out.printf("Enter produce name : ");
            String nameProduce = scanner.next();
            System.out.printf("Enter produce price : ");
            int priceProduce = scanner.nextInt();
            produce.setName(nameProduce);
            produce.setPrice(priceProduce);
        }
    }


}
