package com.yk.ykerp;

import com.yk.ykerp.dao.YkUserDao;
import com.yk.ykerp.entity.YkUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class YkErpApplicationTests {

    @Autowired
    private YkUserDao ykUserDao;

    @Test
    public void contextLoads() {
        YkUser ykUser = new YkUser();
        ykUser.setUserName("test")
                .setPassword("123456")
                .setAccount("123456");
        ykUserDao.insert(ykUser);

    }

}
