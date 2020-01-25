import java.util.stream.IntStream;

public class Java8Stream {
	
	public static void main(String [] args)
	{
		IntStream.range(0, 10).forEach(System.out::println);
		System.out.println("dddddddddddd");
		IntStream.range(0, 10).skip(5).forEach(x->System.out.println(x));
		IntStream.range(0, 10).skip(5).filter(i->i>6).forEach(x->System.out.println(x));
		System.out.println(IntStream.range(5, 10).sum());
	}

}
