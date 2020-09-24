package cn.hengzhi.controller;

import cn.hengzhi.entity.Account;
import cn.hengzhi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author aiwoqe
 * @Type ConflictController
 * @Desc
 * @date 2020年09月24日
 * @Version V1.0
 */
@Controller
@RequestMapping("/account")
public class ConflictController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);

        System.out.println("冲突");

        return "list";
    }
    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
//    将前台送过来的name和money封装进account对象中
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");

        System.out.println("冲突");

        return;
    }
}
