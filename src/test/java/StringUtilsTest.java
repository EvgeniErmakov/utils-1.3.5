

import org.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("StringUtilsTest")
public class StringUtilsTest {

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("0", true),
                Arguments.of("1990", true),
                Arguments.of("-1990", true),
                Arguments.of("-9223372036854775808", true),
                Arguments.of("9223372036854775807", true),
                Arguments.of("Hi", false),
                Arguments.of(null, false),
                Arguments.of("", false)
        );
    }

    @MethodSource("provideArguments")
    @ParameterizedTest()
    void checkEmailTest(String string, boolean expected) {
        boolean actual = StringUtils.isPositiveNumber(string);
        assertEquals(expected, actual);
    }
}