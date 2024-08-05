package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述：
 *
 * @author https:www.unfbx.com
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperSegment implements Serializable {

    private Integer id;
    private Integer seek;
    private BigDecimal start;
    private BigDecimal end;
    private BigDecimal temperature;
    private String text;

    @JsonProperty("avg_logprob")
    private Double avgLogprob;

    @JsonProperty("compression_ratio")
    private Double compressionRatio;

    @JsonProperty("no_speech_prob")
    private Double noSpeechProb;
}
