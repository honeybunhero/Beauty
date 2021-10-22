package app.beautyapplication;

public class ProductModel {
    final private String Name, Brand, ProductType;

    public ProductModel(String name, String brand, String productType) {
        this.Name = name;
        this.Brand = brand;
        this.ProductType = productType;
    }

    public String GetName() {
        return Name;
    }

    public String GetBrand() {
        return Brand;
    }

    public String GetProductType() {
        return ProductType;
    }
}
