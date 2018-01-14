package study.project.emf.mapper;

import study.project.emf.entity.zhihu.UserBaseInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserBaseInfoMapper extends Mapper<UserBaseInfo> {
	List<UserBaseInfo> getLocationStatic(Integer selectLimitAmount);

	int getAmountByReocordItem(UserBaseInfo record);
}