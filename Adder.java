import java.math.BigDecimal;
import java.util.List;

public class Adder {
    // a)
    public int add(int a, int b) {
        return a + b;
    }

    // b)
    public BigDecimal add(List<BigDecimal> decimals) {
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal num : decimals) {
            result = result.add(num);
        }
        return result;
    }
}