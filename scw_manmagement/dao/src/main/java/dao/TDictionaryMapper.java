package dao;

import bean.TDictionary;
import java.util.List;

public interface TDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDictionary record);

    TDictionary selectByPrimaryKey(Integer id);

    List<TDictionary> selectAll();

    int updateByPrimaryKey(TDictionary record);
}