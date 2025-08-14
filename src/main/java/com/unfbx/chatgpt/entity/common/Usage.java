package com.unfbx.chatgpt.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：Usage使用情况统计
 * 兼容新版本OpenAI API的详细token统计信息
 *
 * @author grt1228
 * 2023-02-15
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usage implements Serializable {
    
    // 基础token统计字段
    @JsonProperty("prompt_tokens")
    private long promptTokens;

    @JsonProperty("completion_tokens")
    private long completionTokens;

    @JsonProperty("total_tokens")
    private long totalTokens;
    
    // 新版本API扩展字段
    
    /**
     * 缓存命中的提示tokens数量
     */
    @JsonProperty("prompt_cache_hit_tokens")
    private Integer promptCacheHitTokens;
    
    /**
     * 提示tokens详细信息
     */
    @JsonProperty("prompt_tokens_details")
    private InputTokenDetails promptTokensDetails;
    
    /**
     * 完成tokens详细信息
     */
    @JsonProperty("completion_tokens_details")
    private OutputTokenDetails completionTokenDetails;
    
    /**
     * 输入tokens数量（可能是promptTokens的别名）
     */
    @JsonProperty("input_tokens")
    private Integer inputTokens;
    
    /**
     * 输出tokens数量（可能是completionTokens的别名）
     */
    @JsonProperty("output_tokens")
    private Integer outputTokens;
    
    /**
     * 输入tokens详细信息（可选字段）
     */
    @JsonProperty("input_tokens_details")
    private InputTokenDetails inputTokensDetails;
    
    /**
     * 成本信息（OpenRouter等提供商的扩展字段）
     */
    @JsonProperty("cost")
    private Object cost;
}
