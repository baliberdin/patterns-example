package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class MaxPriceOrderedQueryParametersDecorator extends QueryParametersDecorator {
    public MaxPriceOrderedQueryParametersDecorator(QueryParameters queryParameters) {
        super(queryParameters);
    }

    @Override
    public Map<String, String> compile() {
        return addSorting(super.compile());
    }

    private Map<String, String> addSorting(Map<String, String> params) {
        params.put("sort","price desc, score desc");
        return params;
    }
}
