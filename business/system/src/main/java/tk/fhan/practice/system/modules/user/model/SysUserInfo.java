package tk.fhan.practice.system.modules.user.model;

import lombok.Data;
import tk.fhan.practice.system.modules.user.enums.UserTypeEnum;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 11:15 2018/10/24
 * @modified By:
 */
@Data
public class SysUserInfo {
    private String id;
    private String userName;
    private String userIdCard;
    private UserTypeEnum userType;
}
