package testdata;

public class Product {
    String name,type;
    int qty;

    public Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.type = productBuilder.type;
        this.qty = productBuilder.qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public int getQty() {
        return qty;
    }

    public static class ProductBuilder{
        String name,type;
        int qty;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public ProductBuilder setQty(int qty) {
            this.qty = qty;
            return this;
        }

        public Product build() {
            //api utilities to create product
            return new Product(this);
        }

    }

}
