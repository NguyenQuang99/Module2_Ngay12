package model;

public class Product implements Comparable<Product> {
    private int Id;
    private String name;
    private int price;
    public Product() {

    }

    public Product(int id, String name, int price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        if(o.getPrice() > this.getPrice()) {
            return -1;
        } else if(o.getPrice() == this.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}
