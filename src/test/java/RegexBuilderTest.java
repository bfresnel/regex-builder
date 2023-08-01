import fr.bfr.RegexBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegexBuilderTest {

    private final RegexBuilder regexBuilder = new RegexBuilder();

    @Test
    void testOnlyCharacter() {
        String result = regexBuilder.match()
            .onlyLetters()
            .build();
        Assertions.assertEquals("[a-zA-Z]", result);
    }

    @Test
    void testOnlyNumber() {
        String result = regexBuilder.match()
            .onlyNumber()
            .build();
        Assertions.assertEquals("[0-9]", result);
    }
}
