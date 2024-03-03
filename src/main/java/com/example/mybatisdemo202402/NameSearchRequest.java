package com.example.mybatisdemo202402;

import java.util.Objects;

public class NameSearchRequest {

    private String startsWith;
    private String endsWith;
    private String contains;

    public NameSearchRequest(String startsWith,String endsWith,String contains){
        this.startsWith = startsWith;
        this.endsWith = endsWith;
        this.contains = contains;
    }

    public String getStartsWith(){
        if(Objects.isNull(startsWith)) {
            return "";
        }else{
            return startsWith;
        }
    }

    public String getEndsWith(){
        if(Objects.isNull(endsWith)) {
            return "";
        }else{
            return endsWith;
        }
    }

    public String getContains(){
        if(Objects.isNull(contains)) {
            return "";
        }else{
            return contains;
        }
    }
}
