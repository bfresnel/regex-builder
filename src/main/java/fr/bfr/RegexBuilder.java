package fr.bfr;

public class RegexBuilder {

    private final StringBuilder stringBuilder = new StringBuilder();

    public RegexBuilder match() {
        stringBuilder.append("[]");
        return this;
    }

    public RegexBuilder onlyLetters() {
        // We can also use "\w" ...
        stringBuilder.insert(1, "a-zA-Z");
        return this;
    }

    public RegexBuilder onlyNumber() {
        stringBuilder.insert(1, "0-9");
        return this;
    }

    public String build() {
        return stringBuilder.toString();
    }
}
