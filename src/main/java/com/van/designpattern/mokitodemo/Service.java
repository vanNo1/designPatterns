package com.van.designpattern.mokitodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    private Dao dao;
    @Autowired
    private Repo repo;

    public int returnInt() {
        return dao.findOne() + repo.findOne();
    }

    public void print() {
        System.out.println(dao.findOne());
        System.out.println(repo.findOne());
    }
    public void withoutDependency(){
        System.out.println("service");
    }
}
