package org.obsidian.scss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.scss.entity.Conversation;
import org.obsidian.scss.entity.ConversationExample;
import org.obsidian.scss.entity.DayAndTime;

public interface ConversationMapper {
    long countByExample(ConversationExample example);

    int deleteByExample(ConversationExample example);

    int insert(Conversation record);

    int insertSelective(Conversation record);

    List<Conversation> selectByExample(ConversationExample example);

    int updateByExampleSelective(@Param("record") Conversation record, @Param("example") ConversationExample example);

    int updateByExample(@Param("record") Conversation record, @Param("example") ConversationExample example);

    List<Conversation> selectByClientId(int clientId);

    List<Conversation> selectByServiceId(int serviceId);

    List<Conversation> selectByConversationId(int conversationId);

    int selectCountByServiceId(int serviceId);

    int selectAvgScoreByServiceId(int serviceId);

    int updateStopTime(@Param("conversationId") int conversationId,@Param("stopTime") long stopTime,@Param("score") int score);

    int selectLastIdByClientId(int clientId);
    /**
     * Create By Cjn
     */
    int selectConversationNotFinish();
    List<DayAndTime> selectRecentMonth(@Param("timestamp") Long timestamp);
    List<DayAndTime> selectRecentWeekend(@Param("timestamp") Long timestamp);
    List<DayAndTime> selectRecentHour(@Param("timestamp") Long timestamp);
    List<DayAndTime> selectRecentMinute(@Param("timestamp") Long timestamp);
    
}