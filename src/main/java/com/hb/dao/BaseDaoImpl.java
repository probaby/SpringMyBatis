package com.hb.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hb.entity.Students;
@Repository
public class BaseDaoImpl {
	@Resource
	SqlSession sqlSession;

	public List<Students> findUserByIdTest() {
		// TODO Auto-generated method stub
		List<Students> list  = sqlSession.selectList("students.findStudentsById", 1);
        System.out.println(list.toString());
        // 释放资源
        sqlSession.close();
        return list;
	}

	public List<Students> findUserByNameTest() {
		// TODO Auto-generated method stub
        // list中的user和映射文件中resultType所指定的类型一致
        List<Students> list = sqlSession.selectList("students.findStudentsByName", "hb");
        System.out.println(list.toString());
        sqlSession.close();
		return null;
	}

	public int insertInto() {
		// TODO Auto-generated method stub
        // list中的user和映射文件中resultType所指定的类型一致
        int list = sqlSession.insert("students.insertAndGetId", new Students(1,"hb",1,"beijing"));
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
		return list;
	}
	
	
	
}
