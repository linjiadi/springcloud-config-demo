package com.springcloud.service.impl;

import com.springcloud.dao.DeptMapper;
import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linjd
 * @create 2019-07-21 15:03
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
