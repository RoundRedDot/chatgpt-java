package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * 描述： chat模型附带图片的参数
 *
 * @author grt1228
 * @since 1.1.2
 * 2023-11-10
 */
@Data
@SuperBuilder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatCompletionWithPicture extends BaseChatCompletion implements Serializable {
    /**
     * 问题描述
     */
    private List<MessagePicture> messages;

}
