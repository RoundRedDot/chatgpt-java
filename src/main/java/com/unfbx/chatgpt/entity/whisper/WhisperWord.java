package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述：Whisper单词级别时间戳信息
 * 当启用word_timestamps时返回的单词时间戳数据
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperWord implements Serializable {

    /**
     * 单词文本
     */
    private String word;

    /**
     * 单词开始时间（秒）
     */
    private BigDecimal start;

    /**
     * 单词结束时间（秒）
     */
    private BigDecimal end;
}
