package tk.fhan.practice.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.fhan.practice.system.modules.user.mapper.SystemUserInfoMapper;
import tk.fhan.practice.system.modules.user.model.SysUserInfo;

import java.util.List;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 11:21 2018/10/24
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemBaseTest {
    @Autowired
    private SystemUserInfoMapper systemUserInfoMapper;

    @Test
    public void testMybatis() {
        SysUserInfo sysUserInfo = new SysUserInfo();
        sysUserInfo.setId("ashdy123kznc0123gxja21");
        sysUserInfo.setUserName("mybatis-plus");
        sysUserInfo.setUserIdCard("123456789123456789");
        int insert = systemUserInfoMapper.insert(sysUserInfo);
        System.out.println(insert);
    }

    /**
     * mybatis-plus 条件构造器用法
     */
    @Test
    public void testMybatisWrapper() {
        System.out.println("----- 普通查询 ------");
        SysUserInfo sysUserInfo = systemUserInfoMapper.selectOne(
                new QueryWrapper<SysUserInfo>().eq("user_name", "mybatis-plus"));
        System.out.println(sysUserInfo);

        System.out.println("----- 带子查询(sql注入) ------");
        List<SysUserInfo> plainUsers2 = systemUserInfoMapper.selectList(new QueryWrapper<SysUserInfo>()
                .inSql("role_id", "select id from role where id = 2"));
        List<SysUserInfo> lambdaUsers2 = systemUserInfoMapper.selectList(new QueryWrapper<SysUserInfo>().lambda()
                .inSql(SysUserInfo::getId, "select id from role where id = 2"));

        System.out.println("----- 带嵌套查询 ------");
        List<SysUserInfo> plainUsers3 = systemUserInfoMapper.selectList(new QueryWrapper<SysUserInfo>()
                .nested(i -> i.eq("role_id", 2L).or().eq("role_id", 3L))
                .and(i -> i.ge("age", 20)));
        List<SysUserInfo> lambdaUsers3 = systemUserInfoMapper.selectList(new QueryWrapper<SysUserInfo>().lambda()
                .nested(i -> i.eq(SysUserInfo::getId, 2L).or().eq(SysUserInfo::getId, 3L))
                .and(i -> i.ge(SysUserInfo::getUserIdCard, 20)));

        System.out.println("----- 自定义(sql注入) ------");
        List<SysUserInfo> plainUsers4 = systemUserInfoMapper.selectList(new QueryWrapper<SysUserInfo>()
                .apply("role_id = 2"));
    }
}