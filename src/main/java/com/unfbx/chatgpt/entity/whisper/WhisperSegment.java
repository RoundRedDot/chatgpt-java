package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 描述：Whisper分段信息
 * 对应 Segment 结构
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperSegment implements Serializable {

    /**
     * 分段ID
     */
    private Integer id;
    
    /**
     * 查找位置
     */
    private Integer seek;
    
    /**
     * 分段开始时间（秒）
     */
    private BigDecimal start;
    
    /**
     * 分段结束时间（秒）
     */
    private BigDecimal end;
    
    /**
     * 此分段的文本内容
     */
    private String text;
    
    /**
     * Token序列
     */
    private List<Integer> tokens;
    
    /**
     * 温度参数
     */
    private BigDecimal temperature;

    /**
     * 平均对数概率
     */
    @JsonProperty("avg_logprob")
    private Double avgLogprob;

    /**
     * 压缩比率
     */
    @JsonProperty("compression_ratio")
    private Double compressionRatio;

    /**
     * 无语音概率
     */
    @JsonProperty("no_speech_prob")
    private Double noSpeechProb;
}
