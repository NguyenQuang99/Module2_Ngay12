import java.lang.invoke.SwitchPoint;
import java.util.*;

import model.Product;
import service.IService;
import service.ProductManager;

public class Main {
    static void display(List list) {
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> productList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.printf("Menu");
            System.out.printf("1.Add Product");
            System.out.printf("2.Edit product");
            System.out.printf("3.Delete");
            System.out.printf("4.Show Product");
            System.out.printf("5.Search Product");
            System.out.printf("0.Exit");
            System.out.println("Enter the choice :");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Enter Id :");
                    int Id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("enter a Name: ");
                    String name = scanner.nextLine();
                    System.out.print("enter a Price: ");
                    int price = scanner.nextInt();
                    Product newProduct = new Product(Id,name,price);
                    productManager.addProduct(newProduct);
                    productList = productManager.showProduct();
                    display(productList);
                    break;
                case 2:
                    System.out.print("enter a ID: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("enter a Name: ");
                    String nameEdit = scanner.nextLine();
                    System.out.print("enter a Price: ");
                    int priceEdit = scanner.nextInt();
                    Product editProduct = new Product(idEdit, nameEdit,  priceEdit);
                    productManager.editProduct(editProduct);
                    productList = productManager.showProduct();
                    display(productList);
                    break;

                case 3:
                    System.out.println("enter the Id :");
                    int idDelete = scanner.nextInt();
                    productManager.deleteProduct(idDelete);
                    productList = productManager.showProduct();
                    display(productList);
                    break;

                case 4:
                    for(Product product : productList) {
                        System.out.println(product);
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the name");
                    String search = scanner.nextLine();
                    System.out.println(productManager.searchProduct(search));
                    break;
                case 0 :
                    System.exit(0);

            }
        }


    }



}
