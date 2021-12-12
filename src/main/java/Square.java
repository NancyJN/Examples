import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square {
    public static void main(String[] args) {

            List<Integer> listOfIntegers = new ArrayList<>();

            List<Integer> doub = new ArrayList<>();

            listOfIntegers.addAll(Arrays.asList(1, 2, 3));

            doub.addAll(Arrays.asList(6, 8, -6, -8, 1));

            listOfIntegers.replaceAll(integer -> apply(integer));// lambda

            doub.replaceAll(Square::apply);// method reference

            System.out.println(listOfIntegers); // printing the first line

            System.out.println(doub);// printing the second arguement
        }

    private static Integer apply(Integer integer) {
        return integer * integer;
    }
}

