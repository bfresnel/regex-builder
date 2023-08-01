package fr.bfr;

public class Regex {

    private MatcherGroup matcherGroup;

    private ExcludeGroup excludeGroup;

    public Regex(MatcherGroup matcher, ExcludeGroup exclude) {
        this.matcherGroup = matcher;
        this.excludeGroup = exclude;
    }
}
