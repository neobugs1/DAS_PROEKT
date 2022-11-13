package com.example.dians_project.service.impl;
import com.example.dians_project.service.Filter;

import java.util.Arrays;
import java.util.List;

public class RemoveNamesFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] fields = input.split(",");
        String[] noNames = Arrays.copyOfRange(fields, 2, fields.length);
        String res = "";
        for (String field : noNames){
            res += field + ",";
        }
        return res;
    }
}
