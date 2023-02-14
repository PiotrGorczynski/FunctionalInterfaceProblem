package java;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyConsumer
{

    public void consumeConsumer(Consumer<String> consumer)
    {
        consumer.accept("myArgument");
    }

    public void consumeSupplier(Supplier<?> supplier)
    {
        System.out.println(supplier.get());
    }

    public void consumeFunction(Function<String, String> function)
    {
        System.out.println(function.apply("123"));
    }
}
