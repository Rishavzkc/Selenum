package Consumer;

import java.util.function.Consumer;

public class ConsumerChaining {
	String name;
	String result;

	ConsumerChaining(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

class Test5 {
	public static void main(String[] args) {
		Consumer<ConsumerChaining> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");

		Consumer<ConsumerChaining> c2 = m -> System.out
				.println("Movie:" + m.name + " is just Released and it is:" + m.result);

		Consumer<ConsumerChaining> c3 = m -> System.out
				.println("Movie:" + m.name + " information storing in the database");

		Consumer<ConsumerChaining> chainedC = c1.andThen(c2).andThen(c3);

		ConsumerChaining m1 = new ConsumerChaining("Bahubali", "Hit");
		chainedC.accept(m1);

		ConsumerChaining m2 = new ConsumerChaining("Spider", "Flop");
		chainedC.accept(m2);
	}
}
