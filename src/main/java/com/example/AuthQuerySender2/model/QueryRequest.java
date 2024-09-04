package com.example.AuthQuerySender2.model;

public class QueryRequest {

    private String tableName;
    private String query;

    // getters and setters
    public QueryRequest(String tableName, String query) {
        this.tableName = tableName;
        this.query = query;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}
