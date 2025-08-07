package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 流式响应选项
 * 
 * @author grt1228
 * @since 1.1.3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreamOptions implements Serializable {
    
    /**
     * 是否在流式响应中包含使用统计信息
     */
    @JsonProperty("include_usage")
    private Boolean includeUsage;
}
