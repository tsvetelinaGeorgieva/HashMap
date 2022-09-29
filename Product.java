public class Product {
    public Name name;
    public Double price;

    public Product(Name name, Double price) {
        this.setName(name);
        this.price = price;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
