/**
 * Copyright (C), 2011-2018, 微贷网.
 */
package study.project.emf.entity.zhihu;

import lombok.Data;

/**
 * @author wangzhe 2018/1/13.
 */
@Data
public class ZhihuAnswer {

    String id;
    String questionId;
    String anwserWriter;
    String content;
    String praiseNumber;
    String pageUrl;

}
