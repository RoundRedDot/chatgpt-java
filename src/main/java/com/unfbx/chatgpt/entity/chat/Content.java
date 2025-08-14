package com.unfbx.chatgpt.entity.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * 描述：
 *
 * @author grt1228
 * @since 1.1.2
 * 2023-11-10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {
    /**
     * 输入类型：text、image_url
     *
     * @see Type
     */
    private String type;

    private String text;

    @JsonProperty("image_url")
    private ImageUrl imageUrl;

    /**
     * 生成图片风格
     */
    @Getter
    @AllArgsConstructor
    public enum Type {
        TEXT("text"),
        IMAGE_URL("image_url"),
        ;
        private final String name;
    }
}
