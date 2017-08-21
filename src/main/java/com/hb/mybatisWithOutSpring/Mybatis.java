package com.hb.mybatisWithOutSpring;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hb.entity.Students;

public class Mybatis {
    //根据id查询用户信息，得到一条记录结果

    public Students findUserByIdTest() throws Exception{
    	SqlSession sqlSession	= this.getSession();
        // 通过SqlSession操作数据库
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象
        // selectOne查询出一条记录
        Students students = sqlSession.selectOne("students.findStudentsById", 1);
        // 释放资源
        sqlSession.close();
        return students;
        
    }

    // 根据用户名称模糊查询用户列表
    public List<Students> findUserByNameTest() throws Exception {
    	SqlSession sqlSession	= this.getSession();
        // list中的user和映射文件中resultType所指定的类型一致
        List<Students> list = sqlSession.selectList("students.findStudentsByName", "hb");
        sqlSession.close();
        return list;
    }
    public void  insertInto() throws Exception{
    	SqlSession sqlSession	= this.getSession();
        // list中的user和映射文件中resultType所指定的类型一致
        int list = sqlSession.insert("students.insertAndGetId", new Students(2,"hb2",2,"beijing2"));
        System.out.println(list);
        sqlSession.commit();
        sqlSession.close();
    }
    public SqlSession getSession() throws Exception{
        // mybatis配置文件
        String resource = "MybatisWithOutSpring:SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建会话工厂，传入mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);

        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
    public static void main(String[] args) {
		try {
			Mybatis m = new Mybatis();
			m.insertInto();
			System.out.println(m.findUserByIdTest().toString());
			for (Students students: m.findUserByNameTest()){
				System.out.println(students.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}