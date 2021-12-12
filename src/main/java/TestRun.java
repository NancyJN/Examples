import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {
    public static void main(String[] args)
    {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Samosa", DishType.VEG, 2, Arrays.asList("potato", "peas","cumin","spices","salt")));
        dishes.add(new Dish("Meatball", DishType.NON_VEG, 24, Arrays.asList("meat", "ginger","garlic","spices","salt")));
        dishes.add(new Dish("Veggie Curry", DishType.VEG, 18, Arrays.asList("potato", "peas","cumin","spices","salt")));
        dishes.add(new Dish("Paneer tikka", DishType.VEG, 25, Arrays.asList("Paneer", "Pepper","cumin","spices","salt","onion")));
        dishes.add(new Dish("Goat Curry", DishType.NON_VEG, 20, Arrays.asList("Meat", "Onion","Tomato","spices","salt")));
        //System.out.println(dishes);

      //  dishes.stream().filter(d -> d.getType()==DishType.VEG).forEach(System.out::println);
      //  dishes.stream().map(dish -> dish.getName()).forEach(System.out::println);
     //   dishes.stream().map(dish -> dish.getIngredients()).forEach(System.out::println);

    }

}
