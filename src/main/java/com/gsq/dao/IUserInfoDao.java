package com.gsq.dao;

import com.gsq.entity.BookInfo;

/**
 * Created by guansiqi on 2018/10/30.
 */
public interface IUserInfoDao {
    void add(BookInfo info);
    BookInfo selectByPrimaryKey(Integer id);
}