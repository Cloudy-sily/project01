package com.lzw.community.dao;

import com.lzw.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * @author lzw
 * @create 2023-07-27 14:59
 */
@Mapper
public interface LoginTicketMapper {


    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true, keyProperty = "id") //主键自动生成，生成之注入某个对象
    int insertLoginTicket(LoginTicket loginTicket);


    @Select({
            "select id,user_id,ticket,status,expired ",
            "from login_ticket where ticket=#{ticket}"
    })
    LoginTicket selectByTicket(String ticket);


    @Update({
            "<script>",
            "update login_ticket set status=#{status} where ticket=#{ticket} ",
            "<if test=\"ticket!=null\"> ",
            "and 1=1 ",
            "</if>",
            "</script>"
    }) //动态sql
    int updateStatus(String ticket, int status);

}
