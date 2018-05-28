package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class ProductQueryParametersDecorator extends QueryParametersDecorator {
    public ProductQueryParametersDecorator(QueryParameters queryParameters) {
        super(queryParameters);
    }

    @Override
    public Map<String, String> compile() {
        Map<String, String> params = super.compile();
        return addProductParameters(params);
    }

    private Map<String, String> addProductParameters(Map<String, String> params) {
        if(params.containsKey("fq")){
            String fq = params.get("fq");
            fq = fq + " AND type:product";
            params.put("fq", fq);
        }else {
            params.put("fq", "type:product");
        }
        return params;
    }
}
