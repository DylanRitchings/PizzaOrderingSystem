package pizzaorderingsystem;

import pizzaorderingsystem.Pizza;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to manage the pizza order.
 * @author 850579
 */
public class OrderingSystem 
{
    private Canvas canvas;
    private double totalCost;
    
    /**
     * Constructor for the ordering system.
     */
    public OrderingSystem()
    {
        canvas = new Canvas("Pizza Ordering", 900, 650);
        totalCost = 0;
    }
    
    /**
     * Method to draw the outline of the order screen.
     */
    public void drawOrderScreen()
    {
        canvas.setForegroundColor(Color.BLACK);
        // vertical dividers
        canvas.drawLine(300, 0, 300, 600);
        canvas.drawLine(600, 0, 600, 600);
        
        // halfway divider
        canvas.drawLine(0, 300, 900, 300);
        
        // total price line
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        totalCost = Math.round(totalCost*100.0)/100.0;
        canvas.drawString("Total Price of the Order: £", 10, 640);
        
    }
    
    public void drawTotalCost()
    {
        /**
         * Draws the total cost of the pizza on the canvas
         */
        canvas.setForegroundColor(Color.BLACK);
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        totalCost = Math.round(totalCost*100.0)/100.0;
        canvas.drawString("Total Price of the Order: £"+ totalCost, 10, 640);
    }
    
    /**
     * Method to manage the ordering of the pizzas (once completed).
     */
    public void startOrdering()
    {
        PreparePizzaInfo info = new PreparePizzaInfo();
        //List<Object> pizzaList = new ArrayList<Object>();
        for (int i = 0; i < 6; i++) 
        {
            String pizzaSize = info.getPizzaSize();
            String crustType = info.getCrustType();
            String sauceType = info.getSauceType();
            String toppingOne = info.getTopping();
            String toppingTwo = info.getTopping();
            if (i == 0)
            {
                Pizza pizza1 = new Pizza(canvas,"Pizza 1",0,0,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza1.displayPizza();
                totalCost += pizza1.calculateCost();
            }
            else if (i == 1)
            {
                Pizza pizza2 = new Pizza(canvas,"Pizza 2",300,0,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza2.displayPizza();
                totalCost += pizza2.calculateCost();
            }
            else if (i == 2)
            {
                Pizza pizza3 = new Pizza(canvas,"Pizza 3",600,0,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza3.displayPizza();  
                totalCost += pizza3.calculateCost();
            }
            else if (i == 3)
            {
                Pizza pizza4 = new Pizza(canvas,"Pizza 4",0,300,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza4.displayPizza();
                totalCost += pizza4.calculateCost();
            }
            else if (i == 4)
            {
                Pizza pizza5 = new Pizza(canvas,"Pizza 5",300,300,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza5.displayPizza();   
                totalCost += pizza5.calculateCost();
            }
            else if (i == 5)
            {
                Pizza pizza6 = new Pizza(canvas,"Pizza 6",600,300,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
                pizza6.displayPizza();  
                totalCost += pizza6.calculateCost();
            }
            // pizzaList.add(new Pizza(canvas,startX,startY,pizzaSize,crustType,sauceType,toppingOne,toppingTwo));
            // Pizza currentPizza = pizzaList.get(i);
            // this.displayPizza();
            /**
             * Checks if the user wants to order another pizza
             */
            if (i <5){
                boolean carryOn = info.newPizza();
                if (carryOn == false)
                {
                    i = 7;
                }
            }

        }
        drawTotalCost();
        
        // Pizza pizza1 = new Pizza(canvas,startX,startY,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
        // pizza1.displayPizza();
        
        // Pizza pizza2 = new Pizza(canvas,startX,startY,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
        // pizza2.displayPizza();
        
        // Pizza pizza3 = new Pizza(canvas,startX,startY,pizzaSize,crustType,sauceType,toppingOne,toppingTwo);
        // pizza3.displayPizza();
        
    }
    
}
