package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Map;

/**
 * 指定模型必须输出的格式的对象。
 * @author grt1228
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseFormat implements Serializable {
    /**
     * 默认：text
     *
     * @see Type
     */
    private String type;
    
    /**
     * JSON schema 定义，当 type 为 json_object 时使用
     */
    @JsonProperty("json_schema")
    private Map<String, Object> jsonSchema;

    @Getter
    @AllArgsConstructor
    public enum Type {
        JSON_OBJECT("json_object"),
        JSON_SCHEMA("json_schema"),
        TEXT("text"),
        ;
        private final String name;
    }
}
