package application;
import java.util.ArrayList;



public class Fridge
{
    private String food;
    int counter = 0;
    ArrayList<String> suggestions = new ArrayList<String>();


    public Fridge()
    {	}

    public ArrayList<String> findRecipe(ArrayList<String> e)
    {
        // milk branch
        if(e.contains("milk"))
        {
            suggestions.add("\na glass of milk");

            if(e.contains("chicken"))
            {
                suggestions.add("\npour the milk on the chicken 4Head");
            }


        }

        // eggs branch
        if(e.contains("eggs"))
        {
            suggestions.add("\nFried eggs");

            if(e.contains("mayonnaise"))
            {
                suggestions.add("\nEgg salad");
            }
        }

        // chicken branch
        if(e.contains("chicken"))
        {
            suggestions.add("\nEat the chicken RAW SwiftRage");

        }

        if (e.size() == 0)
        {
            suggestions.add("A trip to the grocery store");
        }

        return suggestions;

    }

    public String getFood()
    {
        return this.food;
    }
    public void setFood(String food)
    {
        this.food = food;
        counter ++;
    }
    public int getCounter()
    {
        return counter;
    }
    public void setCounter(int x)
    {
        this.counter=x;
    }
    public String normText(ArrayList<String> e)
    {
        String normie = e.toString().replace("[","").replace("]","").replace(",", "");
        return normie;
    }


}