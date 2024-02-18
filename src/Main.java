import entity.Product;
import service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        //Add Product To The List
        productService.addProduct(new Product(1, "Laptop", "Electronic", "White Table", 2024));
        productService.addProduct(new Product(2, "Charger", "Electronic", "Black Table", 2021));
        productService.addProduct(new Product(3, "Camera", "Electronic", "Caborad", 2024));
        productService.addProduct(new Product(4, "Tab", "Electronic", "White Table", 2019));


        //Display List of Product
        System.out.println("===========================================");
        System.out.println("List Of All Products");
        List<Product> productList = productService.getAllProduct();

        for (Product product : productList){
            System.out.println(product);
        }

        //Get Product By id
        System.out.println("===========================================");
        System.out.println("Product By Id");
        Product byId = productService.getProductById(1);
        System.out.println(byId);

        //Get Product By Name
        System.out.println("===========================================");
        System.out.println("Product By Name");
        Product byName = productService.getProductByName("Camera");
        System.out.println(byName);

        //Get Product By Name
        System.out.println("===========================================");
        System.out.println("Product By Name, Type Or Place");
        List<Product> list = productService.getByNameTypePlace("White Table");
        for (Product product : list){
            System.out.println(product);
        }

        productService.updateById(new Product(2, "Charger", "Electronic", "White Table", 2019), 2);

        //Display List of Product
        System.out.println("===========================================");
        System.out.println("List Of All Products after updating the product");
        List<Product> productList1 = productService.getAllProduct();

        for (Product product : productList1){
            System.out.println(product);
        }

        //Delete Product By id
        System.out.println("===========================================");
        System.out.println("Product by Delete By Id");
        Boolean value = productService.deleteById(3);
        System.out.println("Status : "+ value);

        //Display List of Product
        System.out.println("===========================================");
        System.out.println("List Of All Products after deleting");
        List<Product> productList2 = productService.getAllProduct();

        for (Product product : productList2){
            System.out.println(product);
        }
    }
}