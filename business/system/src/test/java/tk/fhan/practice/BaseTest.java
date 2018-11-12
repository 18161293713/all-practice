package tk.fhan.practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.fhan.practice.system.SystemApplication;
import tk.fhan.practice.system.modules.user.model.SysUserInfo;
import tk.fhan.practice.system.modules.user.repository.SystemUserInfoRepository;

import java.util.List;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 16:58 2018/10/26
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SystemApplication.class)
public class BaseTest {
    @Autowired
    private SystemUserInfoRepository systemUserInfoRepository;

    @Test
    public void test1() {
        List<SysUserInfo> all = systemUserInfoRepository.findAll();
        System.out.println(all.size());
    }
}
