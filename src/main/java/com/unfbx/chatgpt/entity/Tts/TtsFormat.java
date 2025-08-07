package com.unfbx.chatgpt.entity.Tts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author grt1228
 */
@Getter
@AllArgsConstructor
public enum TtsFormat {
    MP3("mp3"),
    OPUS("opus"),
    AAC("aac"),
    FLAC("flac"),
    ;
    private final String name;
}