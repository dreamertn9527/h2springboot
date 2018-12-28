package com.dreamertn9527.dreamertn9527.dao.mongodb.impl;

import com.dreamertn9527.dreamertn9527.dao.mongodb.PersonDao;
import com.dreamertn9527.dreamertn9527.dao.mongodb.SequenceDao;
import com.dreamertn9527.dreamertn9527.domain.mongodb.Demo;
import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;
import com.dreamertn9527.dreamertn9527.repository.mongodb.PersonRepository;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;

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

    private static final String PERSON_DEMO_SEQ = "person_demo_seq";

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

        if(CollectionUtils.isNotEmpty(personPo.getDemoList())){
            for(Demo demo : personPo.getDemoList()){
                if(demo.getId() == null){
                    demo.setId(sequenceDao.get(PERSON_DEMO_SEQ));
                }
            }
        }

        personRepository.save(personPo);
        return personPo.getId();
    }


}
