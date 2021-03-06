/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject CronJobDetail
 */
@XStreamAlias("CronJobDetail")
public class CronJobDetail extends AbstractSObjectBase {

    // JobType
    @XStreamConverter(PicklistEnumConverter.class)
    private JobTypeEnum JobType;

    @JsonProperty("JobType")
    public JobTypeEnum getJobType() {
        return this.JobType;
    }

    @JsonProperty("JobType")
    public void setJobType(JobTypeEnum JobType) {
        this.JobType = JobType;
    }

}
