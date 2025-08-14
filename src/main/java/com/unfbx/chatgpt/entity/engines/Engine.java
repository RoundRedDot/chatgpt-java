package com.unfbx.chatgpt.entity.engines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 *
 * @author grt1228
 *  2023-02-15
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Engine implements Serializable {

    private String id;
    private String object;
    private String owner;
    private boolean ready;
    private Object permissions;
    private long created;

}
