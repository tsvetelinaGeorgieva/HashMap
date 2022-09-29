import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Name, Product> mapOfProducts = new HashMap<>();
        String mark1 = "BMV";
        String model1 = "529";
        double price1 = 2598.63;
        addProduct(mark1, model1, price1, mapOfProducts);

        String mark2 = "Mercedes";
        String model2 = "E526";
        double price2 = 5598.63;
        addProduct(mark2, model2, price2, mapOfProducts);

        String mark3 = "VW";
        String model3 = "Golf";
        double price3 = 7598.63;
        addProduct(mark3, model3, price3, mapOfProducts);

        System.out.println("Before remove");
        printProduct(mapOfProducts);
        removeProduct(mark1, model1, mapOfProducts);
        System.out.println("After remove");
        printProduct(mapOfProducts);

        System.out.println("Change the price");
        changeThePriceOfTheProduct(mark3,model3,5268,  mapOfProducts);
        printProduct(mapOfProducts);

        System.out.println("Search");
        searchOfPrice(mapOfProducts, 5330, 6250);
    }


    public static void addProduct(String mark, String model, double price, Map<Name, Product> mapOfProducts) {
    Name name = new Name(mark, model);
    Product product = new Product(name, price);
    mapOfProducts.put(name, product);
    }

    public static void removeProduct(String mark, String model,Map<Name, Product> mapOfProducts){
        Name name = new Name(mark, model);
        mapOfProducts.remove(name);
    }

    public static void changeThePriceOfTheProduct(String mark, String model, double price, Map<Name, Product> mapOfProducts){
        Name name = new Name(mark, model);
        Product product = new Product(name, price);
        mapOfProducts.put(name, product);
    }

    public static void printProduct(Map<Name, Product> mapOfProducts){
        for(Map.Entry<Name, Product> key : mapOfProducts.entrySet()){
            System.out.println("Mark: " + key.getKey().mark + "; " + "Model: " + key.getKey().model + "; " + "Price: " + key.getValue().price);
        }
    }

    public static void searchOfPrice(Map<Name, Product> mapOfProducts, double priceMin, double priceMax){
        for(Map.Entry<Name, Product> key : mapOfProducts.entrySet()){
            if(key.getValue().price >= priceMin && key.getValue().price <= priceMax){
                System.out.println("Mark: " + key.getKey().mark + "; " + "Model: " + key.getKey().model + "; " + "Price: " + key.getValue().price);
            }
        }

    }
}
