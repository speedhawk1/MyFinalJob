package controller;

import model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2016/12/4.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    SqlSession sqlSession;

    @RequestMapping("create")
    private String create(User user) {
        sqlSession.insert("user.create");
        return "redirect:/index.jsp";
    }

}
