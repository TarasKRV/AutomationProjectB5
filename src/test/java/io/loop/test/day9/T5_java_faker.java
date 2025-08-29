package io.loop.test.day9;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T5_java_faker {
    @Test
    public void test_java_faker() {
        Faker faker = new Faker();

        System.out.println("faker.name().fullName(): " + faker.name().fullName());
        System.out.println(faker.numerify("223-###-####"));
        System.out.println(faker.letterify("?????????"));
        faker.bothify("21??dwa3????");
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.chuckNorris().fact().replace("Chuck Norris", "Feyruz"));

    }
}
