package app.beautyapplication;

public class ProductModel {
    final private String Name, Brand, ProductType, ExpDate;
    final private int ID;

    public ProductModel(int ID, String name, String brand, String productType, String expDate) {
        this.Name = name;
        this.Brand = brand;
        this.ProductType = productType;
        this.ID = ID;
        this.ExpDate = expDate;
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

    public int GetID() {
        return ID;
    }

    public String GetExpDate() {
        return ExpDate;
    };
}
