package java;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main
{
    public static void main(String[] args)
    {
        Producer<String> myProducer = new Producer<>();
        Supplier<String> mySupplier = myProducer.getSupplierImpl("someString");
        Consumer<String> myConsumer = myProducer.getConsumerImpl();
        myConsumer.accept("otherSomeString");

        Function<String, String> myFunction = myProducer.getFunctionImpl("b");
        System.out.println(myFunction.apply("c"));


        Function<String, Integer> myFunction2 = Transformer.getFunctionImpl();
        Optional<Integer> myOptional = Optional.of("myString").map(myFunction2);
        System.out.println(myOptional);

        UnaryOperator<BigDecimal> myUnaryOperator = Transformer.getUnaryOperatorImpl();
        Optional<BigDecimal> myResult = Optional.of(BigDecimal.valueOf(2.25)).map(myUnaryOperator);
        System.out.println(myResult);

        MyConsumer myConsumer2 = new MyConsumer();

        myConsumer2.consumeConsumer(myConsumer);

        myConsumer2.consumeSupplier(mySupplier);

        myConsumer2.consumeFunction(myFunction);
    }
}
