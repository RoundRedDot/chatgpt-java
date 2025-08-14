package com.unfbx.chatgpt.sse;

import com.unfbx.chatgpt.OpenAiStreamClient;
import com.unfbx.chatgpt.entity.chat.ChatCompletion;
import com.unfbx.chatgpt.plugin.PluginAbstract;
import okhttp3.sse.EventSourceListener;

/**
 * 描述： 插件开发返回信息收集sse监听器
 *
 * @author grt1228
 * 2023-08-18
 */
public class DefaultPluginListener extends PluginListener {

    public DefaultPluginListener(OpenAiStreamClient client, EventSourceListener eventSourceListener, PluginAbstract plugin, ChatCompletion chatCompletion) {
        super(client, eventSourceListener, plugin, chatCompletion);
    }
}
