package com.springcloud.dao;

import com.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjd
 * @create 2019-07-21 15:00
 */
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
