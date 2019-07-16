package mybaits.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MenuMapper {

    Map<String, String> selectMenuByMenuId(@Param("id") String id);

    void insertMenu(@Param(value = "map") Map<String, String> map);
}
