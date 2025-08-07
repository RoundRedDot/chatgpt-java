package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 描述：
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperResponse implements Serializable {

    private String text;

    private BigDecimal duration;

    private String language;

    private List<WhisperWord> words;

    private List<WhisperSegment> segments;


}
