package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class RelevanceQuerParametersyDecorator extends QueryParametersDecorator {
    public RelevanceQuerParametersyDecorator(QueryParameters queryParameters) {
        super(queryParameters);
    }

    @Override
    public Map<String, String> compile() {
        return addRelevance(super.compile());
    }

    private Map<String, String> addRelevance(Map<String, String> params) {
        params.put("bf","recip(rord(last_modified)1,1000,1000)");
        params.put("qf","title^0.5 albums^0.2 tags^0.0001");
        return params;
    }
}
