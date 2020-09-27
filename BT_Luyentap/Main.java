package BT_Luyentap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            productManager.showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduce();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                
            }
        } while (choice != 0);
    }
}
