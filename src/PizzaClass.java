
package PizzaMenu;
import java.text.NumberFormat;

public class PizzaClass {
    private String size;
    private String crust;
    private String sauce;
    private String topping1;
    private String topping2;
    
    
    
    public PizzaClass(String size, String crust, String sauce, String topping1, String topping2){
       this.size = size;
       this.crust = crust;
       this.sauce = sauce; 
       this.topping1 = topping1;
       this.topping2 = topping2;
    }
    
    public String makeCost (){
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        

        String priceOfPizza = "";
        priceOfPizza += this.size + " Marime: " + String.valueOf(formatter.format(sizeCost())) + "\n";
        priceOfPizza += this.crust + " Crusta: " + String.valueOf(formatter.format(crustCost())) + "\n";
        priceOfPizza += "Cost: " + String.valueOf(formatter.format(baseCost())) + "\n";
        priceOfPizza += this.topping1 + " Topping: 1* " + String.valueOf(formatter.format(toppingCost(this.topping1, 5)))+ "\n";
        priceOfPizza += this.topping2 + " Topping: 2* " + String.valueOf(formatter.format(toppingCost(this.topping2, 4))) + "\n";
        priceOfPizza += this.sauce + " Sos: " + String.valueOf(formatter.format(sauceCost()))+ "\n";
        return priceOfPizza;
    }
    
    public Double sizeCost(){
        Double cost;
        if (this.size == "Mica"){
            return cost = 15.45;
        }
        else if (this.size == "Medie"){
            return cost = 20.87;
        }
        else if (this.size == "Mare"){
            return cost = 35.90;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double crustCost(){
        Double cost;
        if (this.crust == "Subtire"){
            return cost = 1.08;
        }
        else if (this.crust == "Deep"){
            return cost = 2.10;
        }
        else if (this.crust == "Umpluta"){
            return cost = 2.14;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double sauceCost(){
        Double cost;
        if (this.sauce == "Pesto"){
            return cost = 0.50;
        }
        else {
            return cost = 0.0;
        }
    }
    
    public Double toppingCost(String toppingType, int amountOfToppings){
        if (toppingType == "Masline"){
            Double cost = 0.08 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Cascaval"){
            Double cost = 0.02 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Chilli"){
            Double cost = 0.16 * amountOfToppings;
            return cost;
        }
        else if (toppingType == "Pepperoni"){
            Double cost = 0.10 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Ciuperci"){
            Double cost = 0.10 * amountOfToppings;
            return cost;
        }
        else if (toppingType == "Pui"){
            Double cost = 0.05 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Jalapenos"){
            Double cost = 0.20 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Ceapa"){
            Double cost = 0.7 * amountOfToppings; 
            return cost;
        }
        else if (toppingType == "Porumb"){
            Double cost = 0.03 * amountOfToppings;
            return cost;
        }
        else {
            Double cost;
            return cost = 0.0;
        }
    }
    
    public Double totalCost(){

        Double totalCost = baseCost()+ toppingCost(this.topping1, 5) + toppingCost(this.topping2, 4) + sauceCost(); 
        return totalCost;
    }
    
    public Double baseCost(){

        Double basePrice = sizeCost() + crustCost();
        return basePrice;
    }
}

