package com.aias.demo.dao;

import com.aias.demo.bean.User;
import org.apache.ibatis.annotations.Select;

/**
 * <b>
 *
 * <br>
 * <b>@ClassName:</b> IUserDao <br>
 * <b>@Copyright:</b> 2019 SYX.Tech  All rights reserved <br>
 * <b>@Company:</b>穗易享科技（北京）有限公司 <br>
 * <b>@Date:</b> 2019/8/28  <br>
 *
 * @author <a href="mailto:liuhongyu@se-share.cn"> liuhongyu </a><br>
 * @version V1.0
 */
public interface IUserDao {
    @Select("select * from t_user where id = #{id}")
    public User selectUserById(Integer id);
}
