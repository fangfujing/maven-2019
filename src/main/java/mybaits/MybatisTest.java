package mybaits;

import mybaits.dao.MenuMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MybatisTest {

    public static void main(String[] args) throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("id", "9257");
        map.put("name", "snow");
        map.put("depth", "22");
        map.put("parent_id", "39121");
//        dao.insertMenu(map);
//        sqlSession.commit();
//
        Map<String, String> objects = mapper.selectMenuByMenuId("123");
        System.out.println(objects);


//        Map<String, String> objects = sqlSession.selectOne("mybaits.dao.MenuMapper.selectMenuByMenuId", "1234");
//        System.out.println(JSON.toJSON(objects));
//        sqlSession.close();

//        MappedStatement selectMenuByMenuId = sqlSession.getConfiguration().getMappedStatement("selectMenuByMenuId");
//        MappedStatement selectMenuByMenuId2= sqlSession.getConfiguration().getMappedStatement("mybaits.dao.MenuMapper.selectMenuByMenuId");
//        System.out.println(selectMenuByMenuId);
//        System.out.println(selectMenuByMenuId2);

    }

    class InnerClass {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
