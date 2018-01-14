package study.project.emf.entity.zhihu;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@HelpUrl("http://www.zhihu.com/people/[\\w-]+/followers")
@TargetUrl(value="http://www.zhihu.com/people/[\\w-]+/about")
@Table(name = "user_detail_info")
public class UserDetailInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "detail_user_id")
    private Integer detailUserId;

    /**
     * 抓取页URL
     */
    @ExtractBy(value="//div[@class='profile-navbar clearfix']/a[1]/@href")
    @Column(name = "pageUrl")
    private String pageurl;

    /**
     * 用户名
     */
    @ExtractBy(value="//div[@class='title-section ellipsis']/span[1]/text()")
    private String nickname;

    /**
     * 所在行业
     */
    @ExtractBy(value="//span[@class='business item']/a/text()")
    private String business;

    /**
     * 公司或组织名称
     */
    @ExtractBy(value="//span[@class='employment item']/@title")
    private String employment;

    /**
     * 职位
     */
    @ExtractBy(value="//span[@class='position item']/@title")
    private String position;

    /**
     * 学校或教育机构名
     */
    @ExtractBy(value="//span[@class='education item']/a/text()")
    private String education;

    /**
     * 专业方向
     */
    @Column(name = "educationExtra")
    @ExtractBy(value="//span[@class='education-extra item']/a/text()")
    private String educationextra;

    /**
     * 收藏者
     */
    @ExtractBy(value="//div[@class='zm-profile-module-desc']/span[4]/strong/text()")
    private Integer collecters;

    /**
     * 分享
     */
    @ExtractBy(value="//div[@class='zm-profile-module-desc']/span[5]/strong/text()")
    private Integer shares;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 性别
     */
    @ExtractBy(value="//span[@class='item gender']/i/@class")
    private String gender;
    
    /**
     * 状态
     */
    @ExtractBy(value="//div[@class='zh-profile-account-status']/text()")
    private String status;
   
    
    /**
     * limit  查询参数
     */
    private Integer selectLimitAmount;

    /**
     * 查询结果数量
     */
    private Integer itemResultAmount;

}