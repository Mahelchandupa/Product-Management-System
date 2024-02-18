package service;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product){
        productsList.add(product);
    }

    public List<Product> getAllProduct(){
        return productsList;
    }

    public Product getProductById(int id){
        for (Product product : productsList){
            if (product.getId() == id){
                return product;
            }
        }

        return null;
    }

    public Product getProductByName(String name){
        for (Product product : productsList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public List<Product> getByNameTypePlace(String search){
        List<Product> finds = new ArrayList<>();
        for (Product product : productsList){
            if (product.getName().contentEquals(search) ||
                    product.getPlace().contentEquals(search) || product.getType().contentEquals(search)){
                finds.add(product);
            }
        }

        return finds;
    }

    public void updateById(Product product, int id){
        for (Product product1 : productsList){
            if (product1.getId() == id){
                product1.setName(product.getName());
                product1.setPlace(product.getPlace());
                product1.setType(product.getType());
                product1.setWarranty(product.getWarranty());
            }
        }
    }

    public Boolean deleteById(int id){
        for (Product product : productsList){
            if (product.getId() == id){
                productsList.remove(product);
                return true;
            }
        }
        return null;
    }
}
