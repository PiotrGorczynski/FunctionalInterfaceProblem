import java.util.function.Consumer;
import java.util.function.Supplier;

public class Producer<T>
{
    public Supplier<T> getSupplierImpl(T t)
    {
        return ()->t;
    }

    public Consumer<T> getConsumerImpl()
    {
        return d-> {
            System.out.println("Consumed object: " + d);
        };
    }
}
