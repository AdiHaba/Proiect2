
package PizzaMenu;

import java.util.ArrayList;


public class OrderClass {

    private ArrayList<String> PizzaList;
    private ArrayList<Double> CostList;
     
    public OrderClass(){

         this.PizzaList = new ArrayList<String>();
         this.CostList = new ArrayList<Double>();
    }
    

    public String wholeOrder(){
        String completeOrder = "";
        for (int i=0;i < PizzaList.size();i++)
        {
          completeOrder += this.PizzaList.get(i) + "\n";
        }
        return completeOrder;
    }
    

    public Double orderCost(){
        Double orderCost = 0.0;
        for (int i=0;i < CostList.size();i++)
        {
          orderCost += this.CostList.get(i);
        }
        return orderCost;
    }
    

    public int numOfPizzas(){
        int numPizzas = PizzaList.size();
        return numPizzas;
    }
    

    public void addPizza(String marime, String crusta, String sos, String topping1, String topping2){
        PizzaClass oc = new PizzaClass(marime, crusta, sos, topping1, topping2);
        Double cost = oc.totalCost();
        String NewPizza = "Pret total: " + cost  + " lei" +  "\n";
        NewPizza += oc.makeCost();
        PizzaList.add(NewPizza);
        CostList.add(cost);
    }
    

    public void removePizza(int pizzaToRemove){
        PizzaList.remove(pizzaToRemove);
        CostList.remove(pizzaToRemove);
    }
    

    public void updatePizza(int pizzaToUpdate, String marime, String crusta, String sos, String topping1, String topping2){
        PizzaClass oc = new PizzaClass(marime, crusta, sos, topping1, topping2);
        Double cost = oc.totalCost();
        String NewPizza = "Pret total:" + cost  + " lei" + "\n";
        NewPizza += oc.makeCost();
        PizzaList.set(pizzaToUpdate, NewPizza);
        CostList.set(pizzaToUpdate, cost);
    }
    

    public String getSpecificPizza(int specificPizzaID){
        String specificPizza;
        specificPizza = this.PizzaList.get(specificPizzaID);
        return specificPizza;
    }
}
