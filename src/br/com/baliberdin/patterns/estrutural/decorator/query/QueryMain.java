package br.com.baliberdin.patterns.estrutural.decorator.query;

import java.util.Map;

public class QueryMain {

    public static void main(String[] args){

        QueryBuilder builder = new QueryBuilder();
        QueryParameters query = builder.
                withRelevance().
                ofProduct().
                paginated().
                ofPLUS().
                orderdByMaxrice().
                build();

        Map<String, String> q = query.compile();
        System.out.println(q);
    }

}
