package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reasoning implements Serializable {

    /**
     * 推理努力级别
     * Can be "high", "medium", or "low" (OpenAI-style)
     */
    private String effort;

    /**
     * Specific token limit (Anthropic-style)
     */
    @JsonProperty("max_tokens")
    private Long maxTokens;

    /**
     * 推理摘要
     */
    private String summary;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * Set to true to exclude reasoning tokens from response
     */
    private Boolean exclude;
}
