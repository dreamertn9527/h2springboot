package com.dreamertn9527.dreamertn9527.dao.mongodb.impl;

import com.dreamertn9527.dreamertn9527.dao.mongodb.PersonDao;
import com.dreamertn9527.dreamertn9527.dao.mongodb.SequenceDao;
import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;
import com.dreamertn9527.dreamertn9527.repository.mongodb.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/12
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SequenceDao sequenceDao;

    private static final String PERSON_SEQ = "person_seq";

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonPo findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Long save(PersonPo personPo) {
        if(personPo.getId() == null){
            personPo.setId(sequenceDao.get(PERSON_SEQ));
        }
        personRepository.save(personPo);
        return personPo.getId();
    }


}
