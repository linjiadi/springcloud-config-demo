package com.springcloud.service;

import com.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author linjd
 * @create 2019-07-21 15:02
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
