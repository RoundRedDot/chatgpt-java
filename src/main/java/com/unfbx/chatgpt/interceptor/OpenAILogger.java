package com.unfbx.chatgpt.interceptor;

import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;

/**
 * 描述： 日志
 *
 * @author grt1228
 * 2023-02-28
 */
@Slf4j
public class OpenAILogger implements HttpLoggingInterceptor.Logger {
    @Override
    public void log(@NotNull String message) {
        log.info("OkHttp-------->:{}", message);
    }
}
