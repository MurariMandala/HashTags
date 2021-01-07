package com.springboot.controller;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface TagsRepo extends JpaRepository<HashtagsDtls, Integer> {
	
@Transactional
//@Query(value = "select * from department_test where DEPT_NAME =:department", nativeQuery = true)
//List<DepartmentTest> findItemdesc(@Param("department") String department );
	@Query(value = "SELECT * FROM hashtags_dtls ORDER BY count DESC limit 10", nativeQuery = true)
//HashMap<String, Integer>findTopTen();
    List<HashtagsDtls> getTopTen();

}
