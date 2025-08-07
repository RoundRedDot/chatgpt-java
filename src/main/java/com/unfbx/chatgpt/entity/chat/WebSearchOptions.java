package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * 网络搜索选项
 * 
 * @author grt1228
 * @since 1.1.3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebSearchOptions implements Serializable {
    
    /**
     * 搜索上下文大小
     */
    @JsonProperty("search_context_size")
    private String searchContextSize;
    
    /**
     * 用户位置信息
     */
    @JsonProperty("user_location")
    private Map<String, Object> userLocation;
}
