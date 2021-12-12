import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args)
    {
        Stream<String> stringStream = Stream.generate(()->"Hello");

        List<String> names = Arrays.asList("Nancy", "Neville", "Adrian", "Tummy", "Nancy", "Noel");

       // names.stream().filter(s -> s.startsWith("N")).filter(s -> s.length()>=4).distinct().forEach(System.out::println);
       // names.stream().map(s -> s.length()).forEach(System.out::println);
        //names.stream().map(s -> "Hello "+s).forEach(System.out::println);
        Optional<String> optional = names.stream().filter(s -> s.length() > 4).findFirst();
        optional.ifPresent(System.out::println);


    }
}
