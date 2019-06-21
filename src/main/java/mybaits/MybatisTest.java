package mybaits;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MybatisTest {

    public static void main(String[] args) throws Exception {


        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("id", "1234");
        map.put("name", "abcd");
        map.put("depth", "1");
        map.put("parent_id", "32222");
//        mapper.insertMenu(map);
//        sqlSession.commit();

//        Map<String, String> objects = mapper.selectMenuByMenuId("1234");
//        System.out.println(stringStringMap);


        Map<String, String> objects = sqlSession.selectOne("mybaits.mapper.MenuMapper.selectMenuByMenuId", "1234");
        System.out.println(JSON.toJSON(objects));
        sqlSession.close();

//        MappedStatement selectMenuByMenuId = sqlSession.getConfiguration().getMappedStatement("selectMenuByMenuId");
//        MappedStatement selectMenuByMenuId2= sqlSession.getConfiguration().getMappedStatement("mybaits.mapper.MenuMapper.selectMenuByMenuId");
//        System.out.println(selectMenuByMenuId);
//        System.out.println(selectMenuByMenuId2);

    }
}
