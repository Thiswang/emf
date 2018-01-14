package study.project.emf.entity.zhihu.extend;


import lombok.Data;

@Data
public class NameValue {
    private String name;
    private Integer value;

    public NameValue(String name, Integer value) {
        super();
        this.name = name;
        this.value = value;
    }

}