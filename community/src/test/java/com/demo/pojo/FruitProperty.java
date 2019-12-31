package com.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("fruit")
public class FruitProperty {
    private List<Fruit> list;

    public void setList(List<Fruit> list) {
        this.list = list;
    }
    public List<Fruit> getList() {
        return list;
    }
}
