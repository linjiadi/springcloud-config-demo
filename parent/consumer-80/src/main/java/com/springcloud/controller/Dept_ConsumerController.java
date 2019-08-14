package com.springcloud.controller;

import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linjd
 * @create 2019-08-01 21:05
 */
@RestController
public class Dept_ConsumerController {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }

}
