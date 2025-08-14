package com.unfbx.chatgpt.entity.common;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author grt1228
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageRequest {

    /**
     * 一页数据大小
     */
    private Integer limit;
    /**
     * 排序类型
     */
    private String order;
    /**
     * 分页参数，之前的id，默认值：null
     */
    private String before;
    /**
     * 分页参数，之后的id，默认值：null
     */
    private String after;


    /**
     * 支持的2种类型
     */
    @Getter
    @AllArgsConstructor
    public enum Order {
        DESC("desc"),
        ASC("asc"),
        ;
        private final String name;
    }
}
