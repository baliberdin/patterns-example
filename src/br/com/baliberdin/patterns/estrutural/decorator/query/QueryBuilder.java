package br.com.baliberdin.patterns.estrutural.decorator.query;

public class QueryBuilder {

    private QueryParameters queryParameters;

    public QueryBuilder(){
        queryParameters = new QueryStringParameters();
    }

    public QueryParameters build(){
        return queryParameters;
    }

    public QueryBuilder ofProduct(){
        queryParameters = new ProductQueryParametersDecorator(queryParameters);
        return this;
    }

    public QueryBuilder paginated(){
        queryParameters = new PaginatorQueryParametersDecorator(queryParameters);
        return this;
    }

    public QueryBuilder ofPLUS(){
        queryParameters = new PlusProductQueryParametersDecorator(queryParameters);
        return this;
    }

    public QueryBuilder orderdByMaxrice(){
        queryParameters = new MaxPriceOrderedQueryParametersDecorator(queryParameters);
        return this;
    }

    public QueryBuilder withRelevance(){
        queryParameters = new RelevanceQuerParametersyDecorator(queryParameters);
        return this;
    }
}
