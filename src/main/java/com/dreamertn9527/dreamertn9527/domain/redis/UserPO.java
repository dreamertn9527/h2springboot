package com.dreamertn9527.dreamertn9527.domain.redis;

import lombok.Data;

import java.io.Serializable;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/28
 * @修改描述：
 * @modifier ${tags}
 */
@Data
public class UserPO implements Serializable {

    private static final long serialVersionUID = 8807130932761442232L;
    private Long id;

    private String erp;

    private Long systemId;

    private String roleIds;
}
