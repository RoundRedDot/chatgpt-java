package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 推理相关配置
 * 
 * @author grt1228
 * @since 1.1.3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reasoning implements Serializable {
    
    /**
     * 推理努力级别
     */
    private String effort;
    
    /**
     * 推理摘要
     */
    private String summary;
}
