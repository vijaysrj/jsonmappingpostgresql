package com.mapping.jsontype;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRepository extends CrudRepository<MyTable, Integer> {

}
