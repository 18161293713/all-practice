package tk.fhan.practice.system.modules.user.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author: hans.f.han
 * @description:
 * @date: Created in 13:52 2018/10/24
 * @modified By:
 */
public enum UserTypeEnum implements IEnum<Integer> {

    ADMIN(1, "系统管理员"),
    USER(2, "普通用户");

    private int value;
    private String desc;


    UserTypeEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
