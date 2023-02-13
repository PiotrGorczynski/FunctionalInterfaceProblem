import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Producer<T extends Comparable<T>>
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
    public Function<T,T> getFunctionImpl(T t)
    {
        return u -> u.compareTo(t) > 0 ? u : t;
//        return u -> u.toString().compareTo(t.toString()) > 0 ? u : t;
    }
}
