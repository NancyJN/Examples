import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private DishType type ;
    private double price ;
    private List<String> ingredients;

    public Dish(String name, DishType type, double price, List<String> ingredients) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.ingredients = ingredients;
    }

   // public List<String> addIngredient(String ingredient){
      //  if (ingredient== null || ingredient.length()==0){
            //throw new IllegalArgumentException("Not a valid ingredient");
       // }
      //  if(this.ingredients== null){
       //     this.ingredients = new ArrayList<>();
      //  }
      //  this.ingredients.add(ingredient);
      //  return this.ingredients;
    //}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
