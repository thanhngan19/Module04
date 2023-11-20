package com.example.ss4_ex1_thymeleaf.repository;

import com.example.ss4_ex1_thymeleaf.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class ProductRepository implements IProductRepository{
    //    id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    public static ArrayList<Product> getProductList= new ArrayList<Product>();
    static {
        getProductList.add(new Product(1,"promax1",2000,"phone","th"));
        getProductList.add(new Product(2,"pro2",2000,"phone","th"));
        getProductList.add(new Product(3,"promax",2000,"phone","th3"));
    }
    @Override
    public ArrayList<Product> findAll() {
        return getProductList;
    }

    @Override
    public void editProduct(Product product) {
        for(int i=0; i<getProductList.size(); i++) {
            if(getProductList.get(i).getId()==product.getId()){
                getProductList.get(i).setName(product.getName());
                getProductList.get(i).setNSX(product.getNSX());
                getProductList.get(i).setPrice(product.getPrice());
                getProductList.get(i).setDescription(product.getDescription());
                getProductList.remove(getProductList.get(i));
            }
        }
            }

//        getProductList.remove();
//        getProductList.get(product.getId()).setName(product.getName());
//        getProductList.get(product.getId()).setPrice(product.getPrice());
//        getProductList.get(product.getId()).setDescription(product.getDescription());
//        getProductList.get(product.getId()).setPrice(Float.parseFloat(product.getNSX()));


    @Override
    public void addNew(Product product) {
        getProductList.add(product);
    }

    @Override
    public Product findById(int id) {
        Product findPro = null;
       for(Product product : getProductList){
           if(product.getId() == id){
               findPro=product;
           }
       }
       return findPro;
    }

    @Override
    public  ArrayList<Product> findProduct(String name) {
        ArrayList<Product> products = new ArrayList<Product>();
        for (Product product : getProductList) {
            if (product.getName().equals(name) ) {
                products.add(product);
                break;
            }

        }
      return products;

    }

    @Override
    public void deleteProduct(int id) {
       for(int i=0; i<getProductList.size(); i++) {
           if(getProductList.get(i).getId()==id){
               getProductList.remove(getProductList.get(i));
           }
       }
    }
}
