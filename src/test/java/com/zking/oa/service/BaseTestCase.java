package com.zking.oa.service;

import com.zking.oa.model.Book;
import com.zking.oa.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BaseTestCase {

   protected PageBean pageBean;

   @Before
    public void before(){
       this.pageBean=new PageBean();
   }

}