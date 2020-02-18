package org.wotif.core.api.strings;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.wotif.core.api.Conditions.whenNoneOf;

public class NoneOfStringConditionTest {

    @Test
    public void testNoneOfWithContainsThenReturnOne() {
        Integer result = whenNoneOf("none", "none", "none").contains("est")
                .then(t ->1)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithContainsThenReturnZero() {
        Integer result = whenNoneOf("test", "none", "none").contains("est")
                .then(t ->1)
                .orElse(t ->0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithEqualsThenReturnOne() {
        Integer result = whenNoneOf("none", "none", "none").isEqualTo("test")
                .then(t ->1)
                .orElse(t ->0)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithEqualsThenReturnZero() {
        Integer result = whenNoneOf("test", "none", "none").isEqualTo("test")
                .then(t ->1)
                .orElse(t ->0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void testNoneOfWithIsNullThenReturnOne() {
        Integer result = whenNoneOf("string", "string", "string").isNull()
                .then(t ->1)
                .orElse(t ->0)
                .end();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void testNoneOfWithIsNullThenReturnZero() {
        Integer result = whenNoneOf(null, "string", "string").isNull()
                .then(t ->1)
                .orElse(t ->0)
                .end();
        Assertions.assertThat(result).isEqualTo(0);
    }

}
