package com.van.designpattern;

import com.van.designpattern.mokitodemo.Controller;
import com.van.designpattern.mokitodemo.Dao;
import com.van.designpattern.mokitodemo.Repo;
import com.van.designpattern.mokitodemo.Service;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestDemo {
    @InjectMocks
    private Controller controller;
    @Spy
    private Service service;


    @Before
    public void before() {
        Dao dao = mock(Dao.class);
        when(dao.findOne()).thenReturn(1);
        Repo repo = mock(Repo.class);
        when(repo.findOne()).thenReturn(1);
        ReflectionTestUtils.setField(service, "dao", dao);
        ReflectionTestUtils.setField(service, "repo", repo);
    }

    @Test
    public void test1() {
        System.out.println(service.returnInt());
    }

}
