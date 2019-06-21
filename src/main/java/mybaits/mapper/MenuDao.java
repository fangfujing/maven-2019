package mybaits.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface MenuDao {

    Map selectMenuByMenuId(String id);

    void insertMenu(@Param(value = "map") Map<String, String> map);
}
