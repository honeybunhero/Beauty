package app.beautyapplication;

public class Product {
    String name, brand, productType;
    int id;

    public Product(int id, String name, String brand, String productType) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", productType='" + productType + '\'' +
                ", id=" + id +
                '}';
    }
}
