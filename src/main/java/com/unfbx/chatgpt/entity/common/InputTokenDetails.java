package com.unfbx.chatgpt.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：输入token详细信息
 * 用于统计不同类型的输入token使用情况
 *
 * @author grt1228
 * 2023-02-15
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputTokenDetails implements Serializable {
    
    /**
     * 缓存的tokens数量
     */
    @JsonProperty("cached_tokens")
    private Integer cachedTokens;
    
    /**
     * 缓存创建tokens数量（内部字段，不序列化）
     */
    private Integer cachedCreationTokens;
    
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
     * 图像tokens数量
     */
    @JsonProperty("image_tokens")
    private Integer imageTokens;
}
