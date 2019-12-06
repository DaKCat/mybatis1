package com.zking.oa.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class User implements Serializable {

    public static interface ValidateGroups {
        public static interface Reg{

        }
        public static interface Login{

        }
        }

    @NotBlank(message = "账号不能为空",groups = {User.ValidateGroups.Reg.class,User.ValidateGroups.Login.class})
    @Length(min = 2,max = 10,message = "账号必须是2-10个字符",groups = {User.ValidateGroups.Reg.class,User.ValidateGroups.Login.class})
    private String username;

    @NotBlank(message = "密码不能为空",groups = {User.ValidateGroups.Reg.class,User.ValidateGroups.Login.class})
    private String password;

    @NotBlank(message = "确认密码不能为空",groups = {User.ValidateGroups.Reg.class})
    private String password2;


}
