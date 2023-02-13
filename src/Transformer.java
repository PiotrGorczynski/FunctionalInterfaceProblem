import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Transformer<T,R>
{

    public static <T,R extends Number> Function<T, R> getFunctionImpl()
    {
        return (T t) -> (R)(Integer.valueOf(t.toString().length()));
    }

    public static<T extends Number> UnaryOperator<T> getUnaryOperatorImpl()
    {
        return (T t) -> (T) Integer.valueOf(t.intValue()*2);
    }
}
