
package PizzaMenu;


import java.text.NumberFormat; 
public class JavaCourseworkUP886226 {


    public static void main(String[] args) {


        PizzaClass cw = new PizzaClass("Medie", "Subtire", "Pesto", "Cascaval", "Chilli");
        System.out.println("Pret total:" + cw.totalCost()+ " lei");
        System.out.println(cw.makeCost());
        
        


        OrderClass oc = new OrderClass();
        oc.addPizza("Medie", "Subtire", "Pesto", "Cascaval", "Chilli");
        oc.addPizza("Medie", "Umpluta", "Pesto", "Masline", "Ceapa");
        oc.addPizza("Mica", "Subtire", "Pesto", "Chilli", "Pepperoni");
        oc.addPizza("Mica", "Subtire", "Pesto", "Masline", "Masline");
        


        System.out.println(oc.wholeOrder());
        

        oc.removePizza(2);

        System.out.println(oc.wholeOrder());
        

        oc.updatePizza(1, "Medium", "Umpluta", "Pesto", "Masline", "Ceapa");
     


        System.out.println("Numarul de pizza comandate: " + oc.numOfPizzas());

        System.out.println("Pretul total al comenzii: " + formatter.format(oc.orderCost()));
        
      
                
    }
    
}
