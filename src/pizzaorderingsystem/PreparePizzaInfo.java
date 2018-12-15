package pizzaorderingsystem;


/**
 * This class is used to get the inputs from the user, how many pizzas they want,
 * the size of each pizza, the sauce on each pizza and the toppings on the pizza.
 *
 * @author 850579
 * @version 2
 */
public class PreparePizzaInfo
{
    public int getAmountOfPizzas()
    {
       /**
        * Gets the amount of pizzas the customer wants
        * @return An integer with a max value of 6 
        */
       KeyboardInput keyboardInput = new KeyboardInput();
       System.out.print("How many pizzas are you ordering? ");
       int amountOfPizzas = keyboardInput.getInputInteger();
       System.out.print(" ");
       return amountOfPizzas;
    }
    public String getPizzaSize()
    {
        /**
         * Asks the user for the pizza size.
         * @return A string that will be 'Small', 'Medium' or 'Large'
         */

        KeyboardInput keyboardInput = new KeyboardInput();
        System.out.print("Choose small (10\"), medium (12\") or large (14\"): ");
        String pizzaSize = keyboardInput.getInputString();
        System.out.print(" ");
        return pizzaSize;
    }
    public String getCrustType()
    {
        /**
         * Asks the user for a crust type.
         * @return A string that will be 'deep Pan', 'thin crust' or 'stuffed crust'
         */

        KeyboardInput keyboardInput = new KeyboardInput();
        System.out.print("Crust Type (deep pan, thin crust or stuffed crust): ");
        String crustType = keyboardInput.getInputString();
        System.out.print(" ");
        return crustType;
    }
    public String getSauceType()
    {
        /**
         * Gets the sauce type.
         * @return A string that will be 'tomato' or 'BBQ'
         */
        KeyboardInput keyboardInput = new KeyboardInput();

        System.out.print("Sauce Type (tomato or BBQ): ");
        String sauceType = keyboardInput.getInputString();
        System.out.print(" ");
        return sauceType;
    }
    public String getTopping()
    {
        /**
         * Asks the user for a topping choice.
         * @return A string that will be 'tuna' or 'anchovy'
         */
        KeyboardInput keyboardInput = new KeyboardInput();
        System.out.print("Toppings (tuna or anchovy): ");
        String topping = keyboardInput.getInputString();
        System.out.print(" ");
        return topping;
    }
    
    public boolean newPizza()
    {
        /**
         * Asks the user if they want to order another pizza.
         * @return boolean
         */
        KeyboardInput keyboardInput = new KeyboardInput();
        System.out.print("Do you want to order another pizza? ");
        String answer = keyboardInput.getInputString();
        boolean carryOn = answer.equals("yes");
        System.out.print(" ");
        return carryOn;
    }
}





// 
// /**
//  * This class is used to get the inputs from the user, how many pizzas they want,
//  * the size of each pizza, the sauce on each pizza and the toppings on the pizza.
//  *
//  * @author Dylan Ritchings
//  * @version 1
//  */
// public class PreparePizzaInfo
// {
//     public int getAmountOfPizzas()
//     {
//        /**
//         * Gets the amount of pizzas the customer wants
//         * @return An integer with a max value of 6 
//         */
//         KeyboardInput keyboardInput = new KeyboardInput();
//         System.out.print("How many pizzas are you ordering? ");
//         int amountOfPizzas = keyboardInput.getInputInteger();
//         System.out.print(" ");
//         return amountOfPizzas;
//     }
//     public String getPizzaSize()
//     {
//         /**
//          * Gets the pizza size.
//          * @return A string that will be 'Small', 'Medium' or 'Large'
//          */
//         String pizzaSize = "nothing";
//         while (pizzaSize != "small" || pizzaSize != "medium" || pizzaSize != "large")
//         {   
//             KeyboardInput keyboardInput = new KeyboardInput();
//             System.out.print("Choose small (10\"), medium (12\") or large (14\"): ");
//             pizzaSize = keyboardInput.getInputString();
//         }
//         return pizzaSize;
//     }
//     public String getCrustType()
//     {
//         /**
//          * Gets the crust type.
//          * @return A string that will be 'deep Pan', 'thin crust' or 'stuffed crust'
//          */
//         String crustType = "nothing";
//         while (crustType != "deep pan" || crustType != "thin crust" || crustType != "stuffed crust") 
//         {   
//             KeyboardInput keyboardInput = new KeyboardInput();
//             System.out.print("Crust Type (deep pan, thin crust or stuffed crust): ");
//             crustType = keyboardInput.getInputString();
//         }
//         return crustType;
//     }
//     public String getSauceType()
//     {
//         /**
//          * Gets the sauce type.
//          * @return A string that will be 'tom
//          */
//         KeyboardInput keyboardInput = new KeyboardInput();
//         String sauceType = "nothing";
//         while (sauceType != "tomato" && sauceType != "BBQ")
//         {
//             System.out.print("Sauce Type (tomato or BBQ): ");
//             sauceType = keyboardInput.getInputString();
//         }
//         return sauceType;
//     }
// }
