package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class PaginatorQueryParametersDecorator extends QueryParametersDecorator {

    public PaginatorQueryParametersDecorator(QueryParameters queryParameters) {
        super(queryParameters);
    }

    @Override
    public Map<String, String> compile() {
        return addPagination(super.compile());
    }

    private Map<String, String> addPagination(Map<String, String> params) {
        params.put("start", "0");
        params.put("rows","100");
        return params;
    }
}
