import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
/*  private long previous = 1;
  private long current = 2;

  @Override
  public Long get() {
    long p = previous;
    long next = current + previous;
    previous = current;
    current = next;
    return p;
  }*/
	private long a = 1;
	private long b = 2;
	private long c = 4;
	
  @Override
  public Long get() {
    long p1 = a;
    long p2 = b;
    long p3 = c;
    long next=p1+p2+p3;
    a=p2;
    b=p3;
    c=next;
    return p1;
  }
}
