package com.gsq.controller;

import com.gsq.entity.BookInfo;
import com.gsq.service.IUserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by guansiqi on 2018/10/30.
 */

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Resource
    private IUserInfoService userService;

    @RequestMapping("/test")
    public String test() {
        return "list";
    }

    @RequestMapping("/index")
    public String index() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(BookInfo bookInfo, HttpServletRequest request) {
        String bookname=request.getParameter("name");
        Integer number=Integer.valueOf(request.getParameter("number"));
        String detail = request.getParameter("detail");
        BookInfo info=new BookInfo();
        info.setNumber(number);
        info.setName(bookname);
        info.setDetail(detail);
        userService.add(info);
        bookInfo = info;
        request.setAttribute("currentUser",bookInfo);
        return "login";
    }


}