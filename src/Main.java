import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main
{
    public static void main(String[] args)
    {
        Producer<String> myProducer = new Producer<>();
        Supplier<String> mySupplier = myProducer.getSupplierImpl("someString");
        Consumer<String> myConsumer = myProducer.getConsumerImpl();
        myConsumer.accept("otherSomeString");
    }
}
