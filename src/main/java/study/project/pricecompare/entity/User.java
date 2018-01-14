/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package study.project.pricecompare.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author wangzhe 2018/1/13.
 */
@Data
@ToString(exclude = "password")
public class User {

    private String username;
    private String password;

}
