package com.unfbx.chatgpt.entity.Tts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 生成不同声音的音频
 * <p>具体语音效果参考：<a href="https://platform.openai.com/docs/guides/text-to-speech">text-to-speech</a></p>
 * @author grt1228
 */
@Getter
@AllArgsConstructor
public enum TtsVoice {

    ALLOY("alloy"),
    ECHO("echo"),
    FABLE("fable"),
    ONYX("onyx"),
    NOVA("nova"),
    SHIMMER("shimmer"),
    ;

    private final String name;
}
