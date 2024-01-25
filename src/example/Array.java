package example;

public class Array {

    public static void main(String[] args) {
       
        Product[] obj = new Product[4];

        
        obj[0] = new Product(01, "Black tea");
        obj[1] = new Product(02, "Green tea");
        obj[2] = new Product(03, "Herbal tea");
        obj[3] = new Product(04, "Milk tea");

       
        System.out.println("Product object 1:");
        obj[0].display();

        System.out.println("Product object 2:");
        obj[1].display();

        System.out.println("Product object 3:");
        obj[2].display();

        System.out.println("Product object 4:");
        obj[3].display();
    }
}


class Product {
    int pro_id;
    String pro_name;

   
    Product(int pid, String n) {
        pro_id = pid;
        pro_name = n;
    }

    public void display() {
        System.out.print("Product Id=" + pro_id + " " + "Product Name =" + pro_name);
        System.out.println();
    }
}

