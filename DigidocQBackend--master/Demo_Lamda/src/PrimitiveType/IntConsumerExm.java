package PrimitiveType;

import java.util.function.IntConsumer;

public class IntConsumerExm {

	public static void main(String[] args) {
		
		IntConsumer c =i ->System.out.println("Square root is : "+ (i*i)); ;
		c.accept(5);

	}

}
