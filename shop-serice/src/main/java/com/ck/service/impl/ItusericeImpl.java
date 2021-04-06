package com.ck.service.impl;

import com.ck.dao.Ituserdao;
import com.ck.entity.tuser;
import com.ck.service.Ituserice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItusericeImpl implements Ituserice {
    @Autowired
    private Ituserdao dao;

    @Override
    public List<tuser> query() {
        return dao.query();
    }
}
