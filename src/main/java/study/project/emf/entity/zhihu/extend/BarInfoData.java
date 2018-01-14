package study.project.emf.entity.zhihu.extend;


import lombok.Data;

@Data
public class BarInfoData {

    private Integer[] yAxis;

    private String[] sXAxis;

    public BarInfoData(Integer[] yAxis, String[] sXAxis) {
        super();
        this.yAxis = yAxis;
        this.sXAxis = sXAxis;
    }

}