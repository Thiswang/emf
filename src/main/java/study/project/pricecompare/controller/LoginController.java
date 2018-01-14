/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package study.project.pricecompare.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import study.project.pricecompare.config.mvc.WebSecurityConfig;
import study.project.pricecompare.entity.User;
import study.project.pricecompare.support.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangzhe 2018/1/7.
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String get()
    {
        return "login";
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ModelAndView doLogin(HttpServletRequest request, User user) throws Exception {

        System.out.println(request.getSession().getId());
        System.out.println(request.getSession().getMaxInactiveInterval());

        if(user!=null && "123456".equals(user.getPassword()))
        {
            request.getSession().setAttribute(WebSecurityConfig.SESSION_KEY,user.getUsername());
            return new ModelAndView(new RedirectView("/"));
        }
        else {
            ModelAndView modelAndView = new ModelAndView("login");
            modelAndView.addObject("errorMsg","密码错误！");
            return modelAndView;
        }
    }

}
