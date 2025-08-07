package com.unfbx.chatgpt.entity.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.unfbx.chatgpt.entity.chat.Functions;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author grt1228
 */
@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tool implements Serializable {

    private String type;

    /**
     * type为function时，function参数必输
     */
    private Functions function;


    /**
     * 支持的种类型
     */
    @Getter
    @AllArgsConstructor
    public enum Type {
        CODE_INTERPRETER("code_interpreter"),
        @Deprecated
        RETRIEVAL("retrieval"),
        FUNCTION("function"),
        FILE_SEARCH("file_search"),
        ;
        private final String name;
    }
}
