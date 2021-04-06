package com.ck.dao;

import com.ck.entity.tuser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Ituserdao {
    @Select("SELECT * FROM tuser")
    public List<tuser> query();
}
