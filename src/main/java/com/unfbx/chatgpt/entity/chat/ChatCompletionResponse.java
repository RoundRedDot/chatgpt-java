package com.unfbx.chatgpt.entity.chat;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.unfbx.chatgpt.entity.common.Usage;

import lombok.Data;

/**
 * 描述： chat答案类
 * 兼容新版本OpenAI API responses接口
 *
 * @author grt1228
 * 2023-03-02
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatCompletionResponse implements Serializable {
    private String id;
    private String object;
    private long created;

    /**
     * 创建时间戳（新版responses API使用）
     */
    @JsonProperty("created_at")
    private Long createdAt;

    private String model;
    private List<ChatChoice> choices;
    private Usage usage;
    private String warning;

    @JsonProperty("system_fingerprint")
    private String systemFingerprint;

    // 新版responses API字段

    /**
     * 响应状态
     */
    private String status;

    /**
     * 错误信息
     */
    private Object error;

    /**
     * 不完整详情
     */
    @JsonProperty("incomplete_details")
    private IncompleteDetails incompleteDetails;

    /**
     * 指令内容
     */
    private String instructions;

    /**
     * 最大输出tokens数量
     */
    @JsonProperty("max_output_tokens")
    private Integer maxOutputTokens;

    /**
     * 响应输出内容
     */
    private List<ResponseOutput> output;

    /**
     * 是否启用并行工具调用
     */
    @JsonProperty("parallel_tool_calls")
    private Boolean parallelToolCalls;

    /**
     * 前一个响应ID
     */
    @JsonProperty("previous_response_id")
    private String previousResponseId;

    /**
     * 推理配置
     */
    private Reasoning reasoning;

    /**
     * 是否存储
     */
    private Boolean store;

    /**
     * 温度参数
     */
    private Double temperature;

    /**
     * text
     */
    @JsonProperty("text")
    private JsonNode text;

    /**
     * 工具选择策略
     */
    @JsonProperty("tool_choice")
    private JsonNode toolChoice;

    /**
     * 工具列表
     */
    private List<Map<String, Object>> tools;

    /**
     * Top-p参数
     */
    @JsonProperty("top_p")
    private Double topP;

    /**
     * 截断策略
     */
    private String truncation;

    /**
     * 用户ID
     */
    private String user;

    /**
     * 元数据
     */
    private JsonNode metadata;

    /**
     * 不完整详情内部类
     */
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IncompleteDetails implements Serializable {
        private String reasoning;
    }

    /**
     * 推理配置内部类
     */
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Reasoning implements Serializable {
        private String effort;
        private String summary;
    }

    /**
     * 响应输出内容内部类
     */
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResponseOutput implements Serializable {
        private String type;
        private String id;
        private String status;
        private String role;
        private List<ResponseOutputContent> content;
    }

    /**
     * 响应输出内容详情内部类
     */
    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ResponseOutputContent implements Serializable {
        private String type;
        private String text;
        private List<Object> annotations;
    }
}
