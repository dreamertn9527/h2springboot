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
public class SystemPO implements Serializable {

    private static final long serialVersionUID = -2476872872825493300L;
    private Long id;

    private String name;

    private String url;
}
