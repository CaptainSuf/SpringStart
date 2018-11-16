package com.dev.ctrl;

import com.dev.model.TbUserLoginPO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginCtrl {

    @ResponseBody
    @RequestMapping(value = "/login.do")
    public String login(@RequestBody TbUserLoginPO user){
        if("admin".equals(user.getUserName()) && "123456".equals(user.getPassword())){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }
}
