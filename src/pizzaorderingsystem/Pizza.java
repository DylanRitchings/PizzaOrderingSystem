package pizzaorderingsystem;

import java.awt.*;

/**
 * Class to represent a single pizza.
 * @author 850579
 */
public class Pizza 
{
    private Canvas canvas;
    private double topLeftX;
    private double topLeftY;
    private String size;
    private String crust;
    private String sauce;
    private String toppingOne;
    private String toppingTwo;
    private String name;
    
    /**
     * Constructor for pizza.
     * @param win the window to draw the pizza on
     * @param startX the top-left x coordinate for the section of screen to draw pizza on
     * @param startY the top-left y coordinate for the section of screen to draw pizza on
     */
    public Pizza(Canvas win, String pizzaName, double startX, double startY, String pizzaSize, String crustType, String sauceType, String topping1, String topping2)
    {        
        canvas = win;
        name = pizzaName;
        topLeftX = startX;
        topLeftY = startY;
        size = pizzaSize;
        crust = crustType;
        sauce = sauceType;
        toppingOne = topping1;
        toppingTwo = topping2;
        
    }
    
    /**
     * Method to display the pizza information on the screen.
     */
    public void displayPizza()
    {
        drawPizza();
        drawTopLine();
        drawBottomLine();
        drawSauce();
        toppingsXY() ;
    }
    
    /**
     * Method to display the pizza on the screen.
     */
    private void drawPizza()
    {
        canvas.setForegroundColor(Color.YELLOW);
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 200);
    }
    
    /**
     * Method to display sauce on pizza.
     */
    private void drawSauce()
    {
        /**
         * Method to draw the sauce of the pizza in the correct colour
         */
        if (sauce.equals("tomato")){
            canvas.setForegroundColor(Color.RED);
        }
        else if (sauce.equals("BBQ")){
            canvas.setForegroundColor(Color.ORANGE);
        }
        canvas.fillCircle(topLeftX + 150, topLeftY + 150, 175);

    }
    
    public double calculateCost()
    {
        /**
         * Method to calculate the cost of the pizza
         */
        double cost = 0;
        int radius = 0;
        /**
         * Determine radius
         */
        if (size.equals("small")){
            radius = 5;
        }
        else if (size.equals("medium")){
            radius = 6;
        }
        else if (size.equals("large")){
            radius = 7;
        }
        
        /**
         * Calculate area
         */
        double area = 3.141 * (radius*radius);
        
        /**
         * Calculate cost
         */
        
        if (crust.equals("deep pan")){
            cost += (0.11*area);
        }
        else if (crust.equals("thin crust")){
            cost += (0.08*area);
        }
        else if (crust.equals("stuffed crust")){
            cost += (0.14*area);
        }
        if (sauce.equals("BBQ")){
            cost += 0.5;
        }
        if (toppingOne.equals("tuna")){
            cost += (0.08*5);
        }
        else if (toppingOne.equals("anchovy")){
            cost += (0.07*5);
        }
        if (toppingTwo.equals("tuna")){
            cost += (0.08*4);
        }
        else if (toppingTwo.equals("anchovy")){
            cost += (0.07*4);
        }
        cost = Math.round(cost*100.0)/100.0;
        return (cost);
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen. 
     * This method will display the pizza number and size at the top of the 
     * screen (once completed)
     */
    private void drawTopLine()
    {
        String topLine = name + " - " + size;
                
        double stringX = topLeftX+10;
        double stringY = topLeftY + 25;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(topLine, stringX, stringY);
    }
    
    /**
     * Method to write the information shown in the bottom line of the 
     * individual pizza on the screen.  
     * This method will display the type of crust and sauce ordered (once 
     * completed)
     */
    private void drawBottomLine()
    {
        String bottomLine = "Crust: " + crust+", "+ sauce +" sauce.";
                
        double stringX = topLeftX+10;
        double stringY = topLeftY + 290;
        
        canvas.setForegroundColor(Color.BLACK);
        canvas.setFontSize(15);
        canvas.drawString(bottomLine, stringX, stringY);
    }  
    public void drawToppings(double x, double y,String topping)
    {
        /**
         * Method to display the correct toppings on the canvas.
         * @param x is the x coordinate where the topping will be drawn
         * @param y is the y coordinate where the topping will be drawn
         * @param topping is the type of topping being drawn.
         */
        if (topping.equals("anchovy"))
        {
            canvas.setForegroundColor(Color.GRAY);
            canvas.fillTriangle(x+0, y+0, x+0, y+15, x+15, y+7.5);
            canvas.fillSemiCircle(x+10,y+0,15,15,true,true);
            canvas.fillRectangle(x+15,y+0,20,15);
            canvas.fillSemiCircle(x+25,y+0,15,15,true,false);
            canvas.setForegroundColor(Color.WHITE);
            canvas.fillCircle(x+32,y+7.5,5);
        }
        if (topping.equals("tuna"))
        {
            canvas.setForegroundColor(Color.PINK);  
            canvas.fillTriangle(x+25/1.5,y+0,x+50/1.5,y+25/1.5,x+0,y+25/1.5);
            canvas.setForegroundColor(Color.RED);
            canvas.fillTriangle(x+25/1.5,y+0,x+30/1.5,y+5/1.5,x+20/1.5,y+5/1.5);
            double[] xValues = {x+15/1.5,x+35/1.5,x+40/1.5,x+10/1.5};
            double[] yValues = {y+10/1.5,y+10/1.5,y+15/1.5,y+15/1.5};
            canvas.fillPolygon(xValues,yValues);
            double[] xValues2 = {x+5/1.5,x+45/1.5,x+50/1.5,x+0};
            double[] yValues2 = {y+20/1.5,y+20/1.5,y+25/1.5,y+25/1.5};
            canvas.fillPolygon(xValues2,yValues2);
      
        }
    }
    public void toppingsXY()
    {
        /**
         * A method to call the drawToppings method with the correct x, y coordinates and topping
         */
        
        /**
         * Topping One
         */
        drawToppings(topLeftX+85,topLeftY+100,toppingOne);
        drawToppings(topLeftX+175,topLeftY+100,toppingOne);
        drawToppings(topLeftX+130,topLeftY+145,toppingOne);
        drawToppings(topLeftX+85,topLeftY+190,toppingOne);
        drawToppings(topLeftX+175,topLeftY+190,toppingOne);
        
        /**
         * Topping Two
         */
        drawToppings(topLeftX+130,topLeftY+90,toppingTwo);
        drawToppings(topLeftX+75,topLeftY+145,toppingTwo);
        drawToppings(topLeftX+185,topLeftY+145,toppingTwo);
        drawToppings(topLeftX+130,topLeftY+200,toppingTwo);
        
    }
}
