package com.dreamertn9527.dreamertn9527.domain.mongodb;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/12
 */
@Document(collection = "person")
@Data
public class PersonPo {
    @Id
    private Long id;

    private String name;

    private Integer age;

    private String address;

    private List<Demo> demoList;
}
