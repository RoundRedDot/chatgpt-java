package com.unfbx.chatgpt.entity.fineTune;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.unfbx.chatgpt.exception.BaseException;
import com.unfbx.chatgpt.exception.CommonError;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author grt1228
 */
@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FineTune implements Serializable {

    /**
     * 上传的文件ID
     */
    @NonNull
    @JsonProperty("training_file")
    private String trainingFile;

    @JsonProperty("validation_file")
    private String validationFile;
    /**
     * 参考
     * @see FineTune.Model
     */
    private String model;

    @JsonProperty("n_epochs")
    @Builder.Default
    private Integer n_epochs = 4;

    @JsonProperty("batch_size")
    private Integer batchSize;

    @JsonProperty("learning_rate_multiplier")
    private Double learningRateMultiplier;

    @JsonProperty("prompt_loss_weight")
    @Builder.Default
    private Double promptLossWeight = 0.01;

    @JsonProperty("compute_classification_metrics")
    @Builder.Default
    private boolean computeClassificationMetrics = false;

    @JsonProperty("classification_n_classes")
    private Integer classificationNClasses;

    @JsonProperty("classification_betas")
    private List classificationBetas;

    private String suffix;

    public void setSuffix(String suffix) {
        if(Objects.nonNull(suffix) && !"".equals(suffix) && suffix.length() > 40){
            log.error("后缀长度不能大于40");
            throw new BaseException(CommonError.PARAM_ERROR);
        }
        this.suffix = suffix;
    }

    @Getter
    @AllArgsConstructor
    public enum Model {
        // or a fine-tuned model created after 2022-04-21.
        ADA("ada"),
        BABBAGE("babbage"),
        CURIE("curie"),
        DAVINCI("davinci"),
        ;
        private final String name;
    }
}
