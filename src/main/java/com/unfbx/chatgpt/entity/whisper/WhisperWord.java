package com.unfbx.chatgpt.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 描述：
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperWord implements Serializable {

    private String word;

    private BigDecimal start;

    private BigDecimal end;
}
