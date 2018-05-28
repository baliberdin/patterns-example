package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public abstract class QueryParametersDecorator implements QueryParameters {

    protected QueryParameters queryParameters;

    public QueryParametersDecorator(QueryParameters queryParameters){
        this.queryParameters = queryParameters;
    }

    @Override
    public Map<String, String> compile() {
        return this.queryParameters.compile();
    }
}
