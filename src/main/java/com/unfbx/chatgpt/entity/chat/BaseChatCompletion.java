package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unfbx.chatgpt.entity.chat.tool.ToolChoice;
import com.unfbx.chatgpt.entity.chat.tool.ToolChoiceObj;
import com.unfbx.chatgpt.entity.chat.tool.Tools;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 描述： chat模型基础类
 *
 * @author grt1228
 * @since 1.1.2
 * 2023-11-10
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseChatCompletion implements Serializable {

    @NonNull
    @Builder.Default
    private String model = Model.GPT_3_5_TURBO.getName();

    /**
     * 指定模型必须输出的格式的对象。
     *
     * @since 1.1.2
     */
    @JsonProperty("response_format")
    private ResponseFormat responseFormat;

    /**
     * 已过时，请使用 tools
     *
     * @see #tools
     * @deprecated 使用 tools 替代
     */
    @Deprecated
    private List<Functions> functions;

    /**
     * 模型可能调用的工具列表。
     * 当前版本支持：functions 等
     *
     * @since 1.1.2
     */
    private List<Tools> tools;

    /**
     * 取值：String或者ToolChoiceObj
     *
     * @see ToolChoice.Choice 当取值为String时：ToolChoice.Choice
     * @see ToolChoiceObj 当取值为ToolChoiceObj时：ToolChoiceObj
     * @since 1.1.2
     */
    @JsonProperty("tool_choice")
    private Object toolChoice;

    /**
     * 是否并行调用工具
     *
     * @since 1.1.3
     */
    @JsonProperty("parallel_tool_calls")
    private Boolean parallelToolCalls;
    
    /**
     * 已废弃，请使用 toolChoice
     * @deprecated 使用 toolChoice 替代
     */
    @Deprecated
    @JsonProperty("function_call")
    private Object functionCall;

    /**
     * 使用什么取样温度，0到2之间。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加集中和确定。
     * <p>
     * We generally recommend altering this or but not both.top_p
     */
    @Builder.Default
    private double temperature = 0.2;

    /**
     * 使用温度采样的替代方法称为核心采样，其中模型考虑具有top_p概率质量的令牌的结果。因此，0.1 意味着只考虑包含前 10% 概率质量的代币。
     * <p>
     * 我们通常建议更改此设置，但不要同时更改两者。temperature
     */
    @JsonProperty("top_p")
    @Builder.Default
    private Double topP = 1d;

    /**
     * 为每个提示生成的完成次数。
     */
    @Builder.Default
    private Integer n = 1;

    /**
     * 是否流式输出.
     * default:false
     *
     * @see com.unfbx.chatgpt.OpenAiStreamClient
     */
    @Builder.Default
    private boolean stream = false;
    /**
     * 停止输出标识
     */
    private List<String> stop;
    /**
     * 最大支持4096
     */
    @JsonProperty("max_tokens")
    @Builder.Default
    private Integer maxTokens = 2048;

    /**
     * 最大补全令牌数
     *
     * @since 1.1.3
     */
    @JsonProperty("max_completion_tokens")
    private Integer maxCompletionTokens;

    @JsonProperty("presence_penalty")
    @Builder.Default
    private double presencePenalty = 0;

    /**
     * -2.0 ~~ 2.0
     */
    @JsonProperty("frequency_penalty")
    @Builder.Default
    private double frequencyPenalty = 0;

    
    /**
     * 用户唯一值，确保接口不被重复调用
     */
    private String user;

    /**
     * @since 1.1.2
     */
    private Integer seed;
    /**
     * @since 1.1.6
     */
    private Boolean logprobs;
    /**
     * @since 1.1.6
     */
    @JsonProperty("top_logprobs")
    private Integer topLogprobs;

    /**
     * 推理努力级别
     *
     * @since 1.1.3
     */
    @JsonProperty("reasoning_effort")
    private String reasoningEffort;

    /**
     * Top-K 采样参数
     *
     * @since 1.1.3
     */
    @JsonProperty("top_k")
    private Integer topK;

    /**
     * 输入内容（用于embedding等）
     *
     * @since 1.1.3
     */
    private Object input;

    /**
     * 指令内容
     *
     * @since 1.1.3
     */
    private String instruction;

    /**
     * 大小参数（如图片大小）
     *
     * @since 1.1.3
     */
    private String size;

    /**
     * 编码格式
     *
     * @since 1.1.3
     */
    @JsonProperty("encoding_format")
    private Object encodingFormat;

    /**
     * 维度参数
     *
     * @since 1.1.3
     */
    private Integer dimensions;

    /**
     * 模态信息
     *
     * @since 1.1.3
     */
    private Object modalities;

    /**
     * 音频信息
     *
     * @since 1.1.3
     */
    private Object audio;

    /**
     * 是否启用思考模式
     *
     * @since 1.1.3
     */
    @JsonProperty("enable_thinking")
    private Object enableThinking;

    /**
     * 思考内容
     *
     * @since 1.1.3
     */
    private Object thinking;

    /**
     * 额外请求体
     *
     * @since 1.1.3
     */
    @JsonProperty("extra_body")
    private Object extraBody;

    /**
     * 搜索参数
     *
     * @since 1.1.3
     */
    @JsonProperty("search_parameters")
    private Object searchParameters;

    /**
     * 网络搜索选项
     *
     * @since 1.1.3
     */
    @JsonProperty("web_search_options")
    private WebSearchOptions webSearchOptions;

    /**
     * 使用情况统计
     *
     * @since 1.1.3
     */
    private Object usage;

    /**
     * 推理相关配置
     *
     * @since 1.1.3
     */
    private Reasoning reasoning;

    /**
     * 高分辨率图像设置
     *
     * @since 1.1.3
     */
    @JsonProperty("vl_high_resolution_images")
    private Object vlHighResolutionImages;

    /**
     * 流式响应选项
     *
     * @since 1.1.3
     */
    @JsonProperty("stream_options")
    private StreamOptions streamOptions;

    /**
     * 提示内容（用于非chat模型）
     *
     * @since 1.1.3
     */
    private Object prompt;

    /**
     * 前缀内容
     *
     * @since 1.1.3
     */
    private Object prefix;

    /**
     * 后缀内容
     *
     * @since 1.1.3
     */
    private Object suffix;

    /**
     * 最新模型参考官方文档：
     * <a href=
     * "https://platform.openai.com/docs/models/model-endpoint-compatibility">官方稳定模型列表</a>
     */
    @Getter
    @AllArgsConstructor
    public enum Model {
        /**
         * gpt-3.5-turbo
         */
        GPT_3_5_TURBO("gpt-3.5-turbo"),
        /**
         * gpt-3.5-turbo-0613 支持函数
         */
        GPT_3_5_TURBO_0613("gpt-3.5-turbo-0613"),
        /**
         * gpt-3.5-turbo-16k 超长上下文
         */
        GPT_3_5_TURBO_16K("gpt-3.5-turbo-16k"),
        /**
         * gpt-3.5-turbo-16k-0613 超长上下文 支持函数
         */
        GPT_3_5_TURBO_16K_0613("gpt-3.5-turbo-16k-0613"),
        /**
         * gpt-3.5-turbo-1106 最新的 GPT-3.5 Turbo 模型具有改进的指令跟踪、JSON 模式、可重现的输出、并行函数调用等。
         */
        GPT_3_5_TURBO_1106("gpt-3.5-turbo-1106"),
        /**
         * GPT 4.0
         */
        GPT_4("gpt-4"),
        GPT_4_TURBO("gpt-4-turbo"),
        /**
         * GPT 4.1
         */
        GPT_4_1("gpt-4.1"),
        /**
         * GPT4.0 超长上下文
         */
        GPT_4_32K("gpt-4-32k"),

        /**
         * gpt-4-0613，支持函数
         */
        GPT_4_0613("gpt-4-0613"),
        /**
         * gpt-4-0613，支持函数
         */
        GPT_4_32K_0613("gpt-4-32k-0613"),
        /**
         * 支持数组模式，支持function call，支持可重复输出
         */
        GPT_4_1106_PREVIEW("gpt-4-1106-preview"),
        /**
         * 支持图片
         */
        GPT_4_VISION_PREVIEW("gpt-4-vision-preview"),
        GPT_4O("gpt-4o"),
        GPT_4O_MINI("gpt-4o-mini"),
        GPT_4_5_PREVIEW("gpt-4.5-preview"),
        O3("o3"),
        O3_MINI("o3-mini"),
        O4_MINI("o4-mini"),
        ;

        private final String name;
    }

}
