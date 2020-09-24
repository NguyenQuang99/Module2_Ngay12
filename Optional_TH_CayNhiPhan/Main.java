package Optional_TH_CayNhiPhan;

public class Main {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Tom");
        tree.insert("Hasagi");
        tree.insert("XXXx");
        tree.insert("Adam");
        tree.insert("Michael");
        System.out.println("Sorted :");
        tree.inorder();
        System.out.println(tree.getSize());
    }
}
