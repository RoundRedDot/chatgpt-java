package com.unfbx.chatgpt.entity.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author grt1228
 * @since 2024-05-07
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VectorStore {

    @JsonProperty("file_ids")
    private List<String> fileIds;

    @JsonProperty("metadata")
    private Map metadata;
}
