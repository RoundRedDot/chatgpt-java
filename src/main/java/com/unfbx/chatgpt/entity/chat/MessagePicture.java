package com.unfbx.chatgpt.entity.chat;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.unfbx.chatgpt.entity.chat.tool.ToolCalls;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 描述：
 *
 * @author grt1228
 * @since 2023-03-02
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessagePicture extends BaseMessage {
    /**
     * Content数组支持多图片输入
     * <a href="https://platform.openai.com/docs/guides/vision">vision</a>
     */
    private List<Content> content;


    public static Builder builder() {
        return new Builder();
    }

    /**
     * 构造函数
     *
     * @param role         角色
     * @param name         name
     * @param content      content
     * @param toolCalls    工具调用列表
     * @param toolCallId   工具调用ID
     */
    public MessagePicture(String role, String name, List<Content> content, List<ToolCalls> toolCalls, String toolCallId) {
        this.content = content;
        super.setRole(role);
        super.setName(name);
        super.setToolCalls(toolCalls);
        super.setToolCallId(toolCallId);
    }

    public MessagePicture() {
    }

    private MessagePicture(Builder builder) {
        setContent(builder.content);
        super.setRole(builder.role);
        super.setName(builder.name);
        super.setToolCalls(builder.toolCalls);
        super.setToolCallId(builder.toolCallId);
        super.setFunctionCall(builder.functionCall);
    }

    public static final class Builder {
        private String role;
        private List<Content> content;
        private String name;
        private String toolCallId;
        private List<ToolCalls> toolCalls;
        private FunctionCall functionCall;

        public Builder() {
        }

        public Builder role(Role role) {
            this.role = role.getName();
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder content(List<Content> content) {
            this.content = content;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }



        public Builder toolCalls(List<ToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }

        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        
        @Deprecated
        public Builder functionCall(FunctionCall functionCall) {
            this.functionCall = functionCall;
            return this;
        }

        public MessagePicture build() {
            return new MessagePicture(this);
        }
    }

}
