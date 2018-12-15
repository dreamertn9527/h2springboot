package com.dreamertn9527.dreamertn9527.repository.mongodb;

import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/12
 */
@Repository
public interface PersonRepository extends MongoRepository<PersonPo, Long> {

    PersonPo findById(Long id);

}
