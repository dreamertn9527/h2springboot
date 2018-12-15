package com.dreamertn9527.dreamertn9527.dao.mongodb;

import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/12
 */
public interface PersonDao {

    PersonPo findById(Long id);

    Long save(PersonPo personPo);
}
