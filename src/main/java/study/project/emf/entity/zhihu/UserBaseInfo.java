package study.project.emf.entity.zhihu;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@TargetUrl(value="http://www.zhihu.com/people/[\\w-]+")
@Table(name = "user_base_info")
public class UserBaseInfo {

	@Id
    private Integer id;
 
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[1]/@href", notNull = true)
    @Column(name = "pageUrl")
    private String pageurl;


    /**
     * 昵称
     */
    @ExtractBy(value ="//div[@class='title-section ellipsis']/span[1]/text()", notNull = true)
    private String nickname;

    /**
     * 居住地
     */
    @ExtractBy(value = "//span[@class='location item']/@title")
    private String location;

    /**
     * 微博地址
     */
    @ExtractBy(value = "//div[@class='weibo-wrap']//a/@href")
    @Column(name = "weiboUrl")
    private String weibourl;

    /**
     * 一句话介绍
     */
    @ExtractBy(value = "//div[@class='title-section ellipsis']/span[@class='bio']/@title")
    private String headline;


    /**
     * 关注了
     */
    @ExtractBy(value = "//div[@class='zm-profile-side-following zg-clear']/a[1]/strong/text()")
    private Integer followees;

    /**
     * 关注者
     */
    @ExtractBy(value = "//div[@class='zm-profile-side-following zg-clear']/a[2]/strong/text()")
    private Integer followers;

    /**
     * 关注专栏
     */
    @ExtractBy(value = "//div[@class='zm-side-section-inner zg-clear']/div/a/strong/text()/regex('[1-9]\\d*')")
    private Integer columns;

    /**
     * 关注话题
     */
    @ExtractBy("/regex('[0-9]+\\s个话题')/regex('[1-9]\\d*')")
    private Integer topics;

    /**
     * 主页被多少人浏览
     */
    @ExtractBy(value = "//span[@class='zg-gray-normal']/strong/text()")
    @Column(name = "pageViews")
    private Integer pageviews;

    /**
     * 提问
     */
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[2]/span/text()")
    private Integer questions;

    /**
     * 回答
     */
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[3]/span/text()")
    private Integer answers;

    /**
     * 专栏文章
     */
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[4]/span/text()")
    private Integer articles;

    /**
     * 收藏了
     */
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[5]/span/text()")
    private Integer collections;

    /**
     * 公共编辑
     */
    @ExtractBy(value = "//div[@class='profile-navbar clearfix']/a[6]/span/text()")
    private Integer edits;

    /**
     * 赞同
     */
    @ExtractBy(value = "//span[@class='zm-profile-header-user-agree']/strong/text()")
    @Column(name = "agreeNums")
    private Integer agreenums;

    /**
     * 感谢
     */
    @ExtractBy(value = "//span[@class='zm-profile-header-user-thanks']/strong/text()")
    @Column(name = "thanksNums")
    private Integer thanksnums;

    /**
     * 添加时间
     */
    private Date addtime;

    
    /**
     * 个人简介
     */
    @ExtractBy(value = "//span[@class='content']")
    private String description;

    /**
     * 最近动态（未处理后）
     */
    @ExtractBy(value="//span[@class='zm-profile-setion-time zg-gray zg-right']/text()")
    @Column(name = "lastDynamic")
    private String lastdynamic;
    
	/**
     * 最近动态（处理）
     */
    @Column(name = "lastDynamicTime")
    private Date lastdynamictime;
    /**
     * limit  查询参数
     */
    
    private Integer selectLimitAmount;

    /**
     * 查询结果数量
     */
    private Integer itemResultAmount;

}