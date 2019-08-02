package dao;

import bean.TMemeber;
import java.util.List;

public interface TMemeberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMemeber record);

    TMemeber selectByPrimaryKey(Integer id);

    List<TMemeber> selectAll();

    int updateByPrimaryKey(TMemeber record);
}