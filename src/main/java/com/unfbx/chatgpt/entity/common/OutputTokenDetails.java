package com.unfbx.chatgpt.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：输出token详细信息
 * 用于统计不同类型的输出token使用情况
 *
 * @author grt1228
 * 2023-02-15
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OutputTokenDetails implements Serializable {
    
    /**
     * 文本tokens数量
     */
    @JsonProperty("text_tokens")
    private Integer textTokens;
    
    /**
     * 音频tokens数量
     */
    @JsonProperty("audio_tokens")
    private Integer audioTokens;
    
    /**
     * 推理tokens数量
     */
    @JsonProperty("reasoning_tokens")
    private Integer reasoningTokens;
}
