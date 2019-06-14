package mybaits.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface MenuDao {

    public Map selectMenuByMenuId(String id);

    public void insertMenu(@Param(value = "map") Map<String, String> map);
}
