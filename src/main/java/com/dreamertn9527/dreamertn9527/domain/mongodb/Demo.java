package com.dreamertn9527.dreamertn9527.domain.mongodb;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/23
 * @修改描述：
 * @modifier ${tags}
 */
@Data
public class Demo implements Serializable {

    private static final long serialVersionUID = -1543508981527070229L;
    private Long id;

    private String name;

    private String other;
}
