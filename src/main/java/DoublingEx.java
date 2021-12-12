import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoublingEx {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        List<Integer> doub = new ArrayList<>();
        listOfIntegers.addAll(Arrays.asList(1,2,3));
        doub.addAll(Arrays.asList(6, 8, 6, 8, -1));
        listOfIntegers.replaceAll(DoublingEx::apply);
        doub.replaceAll(DoublingEx::apply);
        System.out.println(listOfIntegers);
        System.out.println(doub);
    }

    private static Integer apply(Integer integer) {
        return integer * 2;
    }


}

