package prng;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class PseudoRandomNumber {
    RandomGenerator  random;
    public void getRandomNumber() {
        random = RandomGenerator.getDefault();

        System.out.println("Random Number: " + random.nextInt(100));

        System.out.println(random.ints(1000, 10000).limit(10).boxed().collect(Collectors.toList()));
    }
}
