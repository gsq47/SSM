package com.gsq.service;

import com.gsq.dao.IUserInfoDao;
import com.gsq.entity.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements IUserInfoService{
    @Autowired
    private IUserInfoDao dao;


    public IUserInfoDao getDao() {
        return dao;
    }
    public void setDao(IUserInfoDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(BookInfo info) {
        dao.add(info);
    }
}
