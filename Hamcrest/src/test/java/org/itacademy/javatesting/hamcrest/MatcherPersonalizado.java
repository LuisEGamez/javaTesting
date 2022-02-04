package org.itacademy.javatesting.hamcrest;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatcherPersonalizado {

    public static Matcher<String> length (Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher,
                "Espera una String de longitud ", "longitud") {

            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }

    @Test
    public void comparaString() {
        assertThat("Mordor", length(is(8)));
    }
}
