package org.mybatis.internal.example;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.internal.example.pojo.User;

public class MybatisHelloWorld {
  public static void main(String[] args) {
    String resource = "org/mybatis/internal/example/Configuration.xml";
    Reader reader;
    try {
      reader = Resources.getResourceAsReader(resource);
      SqlSessionFactory sqlMapper = new  SqlSessionFactoryBuilder().build(reader);

      SqlSession session = sqlMapper.openSession();
      try {
        User user = (User) session.selectOne("org.mybatis.internal.example.mapper.UserMapper.getUser", "219561755720814593");
        System.out.println(user.getId() + "," + user.getUsername());
      } finally {
        session.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
