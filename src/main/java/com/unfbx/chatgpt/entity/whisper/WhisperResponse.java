package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 描述：Whisper语音转文字响应结果
 * 对应 WhisperVerboseJSONResponse 结构
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperResponse implements Serializable {

    /**
     * 任务类型（如：transcribe）
     */
    private String task;

    /**
     * 识别的文本内容
     */
    private String text;

    /**
     * 音频时长
     */
    private BigDecimal duration;

    /**
     * 识别的语言
     */
    private String language;

    /**
     * 单词级别的时间戳信息（当启用word_timestamps时）
     */
    private List<WhisperWord> words;

    /**
     * 分段信息
     */
    private List<WhisperSegment> segments;
}
