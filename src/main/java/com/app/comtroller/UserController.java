package com.app.comtroller;

import com.app.beanconfig.EmailProp;
import com.app.beanconfig.LazyLoadingBean;
import com.app.beanconfig.TestBean;
import com.app.responseModel.UserResponse;
import com.app.service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@PropertySource("classpath:custom.properties")
@Scope("singleton")
public class UserController {

    @Autowired
    TestBean testBean;

    @Autowired
    //@Qualifier("uerServiceImpl")
    private UerService uerService;

    @Autowired
    private LazyLoadingBean lazyLoadingBean;

    @Value("${mail.from}")
    private String from;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Value("${message}")
    private String message;

    @Autowired
    private EmailProp emailProp;

    public UserController() {
        System.out.println("object is created only one time for defining scope singleton");
    }

    @GetMapping("/user")
    public UserResponse getUser() {
        System.out.println("mail prop: "+emailProp.getFrom());
        System.out.println("message--" + message);
        System.out.println("from : " + from + " host: " + host + " port: " + port);
        testBean.method();
        return uerService.getUser();
    }
}
