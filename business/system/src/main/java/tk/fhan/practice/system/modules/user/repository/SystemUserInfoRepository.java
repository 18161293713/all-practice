package tk.fhan.practice.system.modules.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.fhan.practice.system.modules.user.model.SysUserInfo;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 11:14 2018/10/24
 * @modified By:
 */
public interface SystemUserInfoRepository extends JpaRepository<SysUserInfo, Long> {

}
