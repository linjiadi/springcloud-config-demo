package com.springcloud.controller;

import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linjd
 * @create 2019-08-03 10:36
 */
@RestController
@RefreshScope
public class DeptController {
    @Autowired
    private DeptService service;

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)

    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = service.get(id);
        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }


    @GetMapping("/getName")
    public String getName() {
        return name;
    }
}
