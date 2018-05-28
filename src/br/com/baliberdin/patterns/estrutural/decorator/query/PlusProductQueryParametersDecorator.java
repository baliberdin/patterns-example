package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class PlusProductQueryParametersDecorator extends QueryParametersDecorator {
    public PlusProductQueryParametersDecorator(QueryParameters queryParameters) {
        super(queryParameters);
    }

    @Override
    public Map<String, String> compile() {
        return addPlusProductParameter(super.compile());
    }

    private Map<String, String> addPlusProductParameter(Map<String, String> params) {
        if(params.containsKey("fq")){
            String fq = params.get("fq");
            fq = fq + " AND advertisement_type:PLUS";
            params.put("fq", fq);
        }else {
            params.put("fq", "advertisement_type:PLUS");
        }

        return params;
    }
}
