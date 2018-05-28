package br.com.baliberdin.patterns.estrutural.decorator.query;


import java.util.HashMap;
import java.util.Map;

public class QueryStringParameters implements QueryParameters {
    @Override
    public Map<String, String> compile() {
        return new HashMap<>();
    }
}
