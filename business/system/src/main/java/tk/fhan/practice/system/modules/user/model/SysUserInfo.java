package tk.fhan.practice.system.modules.user.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 11:15 2018/10/24
 * @modified By:
 */
@Data
@Entity
public class SysUserInfo {
    @Id
    @GeneratedValue
    private String id;
    private String userName;
    private String userIdCard;
}
