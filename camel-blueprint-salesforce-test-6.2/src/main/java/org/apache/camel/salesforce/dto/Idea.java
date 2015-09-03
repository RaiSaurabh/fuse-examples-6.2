/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.MultiSelectPicklistConverter;
import org.apache.camel.component.salesforce.api.MultiSelectPicklistDeserializer;
import org.apache.camel.component.salesforce.api.MultiSelectPicklistSerializer;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Salesforce DTO for SObject Idea
 */
@XStreamAlias("Idea")
public class Idea extends AbstractSObjectBase {

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // RecordTypeId
    private String RecordTypeId;

    @JsonProperty("RecordTypeId")
    public String getRecordTypeId() {
        return this.RecordTypeId;
    }

    @JsonProperty("RecordTypeId")
    public void setRecordTypeId(String RecordTypeId) {
        this.RecordTypeId = RecordTypeId;
    }

    // CommunityId
    private String CommunityId;

    @JsonProperty("CommunityId")
    public String getCommunityId() {
        return this.CommunityId;
    }

    @JsonProperty("CommunityId")
    public void setCommunityId(String CommunityId) {
        this.CommunityId = CommunityId;
    }

    // Body
    private String Body;

    @JsonProperty("Body")
    public String getBody() {
        return this.Body;
    }

    @JsonProperty("Body")
    public void setBody(String Body) {
        this.Body = Body;
    }

    // NumComments
    private Integer NumComments;

    @JsonProperty("NumComments")
    public Integer getNumComments() {
        return this.NumComments;
    }

    @JsonProperty("NumComments")
    public void setNumComments(Integer NumComments) {
        this.NumComments = NumComments;
    }

    // VoteScore
    private Double VoteScore;

    @JsonProperty("VoteScore")
    public Double getVoteScore() {
        return this.VoteScore;
    }

    @JsonProperty("VoteScore")
    public void setVoteScore(Double VoteScore) {
        this.VoteScore = VoteScore;
    }

    // VoteTotal
    private Double VoteTotal;

    @JsonProperty("VoteTotal")
    public Double getVoteTotal() {
        return this.VoteTotal;
    }

    @JsonProperty("VoteTotal")
    public void setVoteTotal(Double VoteTotal) {
        this.VoteTotal = VoteTotal;
    }

    // Categories
    @XStreamConverter(MultiSelectPicklistConverter.class)
    private CategoriesEnum[] Categories;

    @JsonProperty("Categories")
    @JsonSerialize(using = MultiSelectPicklistSerializer.class)
    public CategoriesEnum[] getCategories() {
        return this.Categories;
    }

    @JsonProperty("Categories")
    @JsonDeserialize(using = MultiSelectPicklistDeserializer.class)
    public void setCategories(CategoriesEnum[] Categories) {
        this.Categories = Categories;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private StatusEnum Status;

    @JsonProperty("Status")
    public StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(StatusEnum Status) {
        this.Status = Status;
    }

    // LastCommentDate
    private org.joda.time.DateTime LastCommentDate;

    @JsonProperty("LastCommentDate")
    public org.joda.time.DateTime getLastCommentDate() {
        return this.LastCommentDate;
    }

    @JsonProperty("LastCommentDate")
    public void setLastCommentDate(org.joda.time.DateTime LastCommentDate) {
        this.LastCommentDate = LastCommentDate;
    }

    // LastCommentId
    private String LastCommentId;

    @JsonProperty("LastCommentId")
    public String getLastCommentId() {
        return this.LastCommentId;
    }

    @JsonProperty("LastCommentId")
    public void setLastCommentId(String LastCommentId) {
        this.LastCommentId = LastCommentId;
    }

    // ParentIdeaId
    private String ParentIdeaId;

    @JsonProperty("ParentIdeaId")
    public String getParentIdeaId() {
        return this.ParentIdeaId;
    }

    @JsonProperty("ParentIdeaId")
    public void setParentIdeaId(String ParentIdeaId) {
        this.ParentIdeaId = ParentIdeaId;
    }

    // IsHtml
    private Boolean IsHtml;

    @JsonProperty("IsHtml")
    public Boolean getIsHtml() {
        return this.IsHtml;
    }

    @JsonProperty("IsHtml")
    public void setIsHtml(Boolean IsHtml) {
        this.IsHtml = IsHtml;
    }

    // IsMerged
    private Boolean IsMerged;

    @JsonProperty("IsMerged")
    public Boolean getIsMerged() {
        return this.IsMerged;
    }

    @JsonProperty("IsMerged")
    public void setIsMerged(Boolean IsMerged) {
        this.IsMerged = IsMerged;
    }

    // CreatorFullPhotoUrl
    private String CreatorFullPhotoUrl;

    @JsonProperty("CreatorFullPhotoUrl")
    public String getCreatorFullPhotoUrl() {
        return this.CreatorFullPhotoUrl;
    }

    @JsonProperty("CreatorFullPhotoUrl")
    public void setCreatorFullPhotoUrl(String CreatorFullPhotoUrl) {
        this.CreatorFullPhotoUrl = CreatorFullPhotoUrl;
    }

    // CreatorSmallPhotoUrl
    private String CreatorSmallPhotoUrl;

    @JsonProperty("CreatorSmallPhotoUrl")
    public String getCreatorSmallPhotoUrl() {
        return this.CreatorSmallPhotoUrl;
    }

    @JsonProperty("CreatorSmallPhotoUrl")
    public void setCreatorSmallPhotoUrl(String CreatorSmallPhotoUrl) {
        this.CreatorSmallPhotoUrl = CreatorSmallPhotoUrl;
    }

    // CreatorName
    private String CreatorName;

    @JsonProperty("CreatorName")
    public String getCreatorName() {
        return this.CreatorName;
    }

    @JsonProperty("CreatorName")
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

}