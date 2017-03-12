package com.dreamertn9527.demo.service;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2017/3/11
 * @修改描述：
 * @modifier ${tags}
 */
@Mapper
public interface HelloMapper {

    List getListInfo(Map map);
}
