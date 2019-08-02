package dao;

import bean.TMemeberProjectFollow;
import java.util.List;

public interface TMemeberProjectFollowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TMemeberProjectFollow record);

    TMemeberProjectFollow selectByPrimaryKey(Integer id);

    List<TMemeberProjectFollow> selectAll();

    int updateByPrimaryKey(TMemeberProjectFollow record);
}