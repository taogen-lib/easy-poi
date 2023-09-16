package com.taogen.easypoi.commons.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.taogen.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Taogen
 */
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticleInfo {

    @Excel(name = "序号", sortNum = 1)
    private Integer no;

    @JsonProperty("acq_from")
    private String acqFrom;
    @JsonProperty("user_tag")
    private List<String> userTag;
    @JsonProperty("keywords")
    private String keywords;

    @JsonProperty("level_id")
    private String levelId;

    @Excel(name = "属性", sortNum = 4)
    private String levelName;

    @JsonProperty("alarm_keywords")
    private String alarmKeywords;

    @Excel(name = "标题", sortNum = 3)
    @JsonProperty("title")
    private String title;

    @JsonProperty("retweeted_status")
    private String retweetedStatus;
    @JsonProperty("dep")
    private List<String> dep;

    @Excel(name = "内容", sortNum = 11)
    @JsonProperty("content")
    private String content;

    @Excel(name = "链接", sortNum = 9)
    @JsonProperty("source_url")
    private String sourceUrl;
    @JsonProperty("is_reply")
    private String isReply;
    @JsonProperty("negative")
    private String negative;
    @JsonProperty("same_count")
    private Integer sameCount;
    @JsonProperty("surface_img")
    private String surfaceImg;

    @Excel(name = "站点", sortNum = 7)
    @JsonProperty("host")
    private String host;

    @Excel(name = "站点名称", sortNum = 8)
    private String hostName;

    @Excel(name = "ID", sortNum = 2)
    @JsonProperty("id")
    private String id;
    @JsonProperty("real_source_id")
    private String realSourceId;
    @JsonProperty("tag")
    private List<String> tag;
    @JsonProperty("ocr")
    private String ocr;
    @JsonProperty("fenjian_filtered")
    private String fenjianFiltered;
    @JsonProperty("senti_keywords")
    private String sentiKeywords;
    @JsonProperty("is_original")
    private String isOriginal;

    @Excel(name= "发帖人", sortNum = 6)
    @JsonProperty("author")
    private String author;

    @Excel(name = "发布时间", sortNum = 10)
    @JsonProperty("pub_time")
    private String pubTime;
    @JsonProperty("img_url")
    private String imgUrl;
    @JsonProperty("ori_id")
    private String oriId;
    @JsonProperty("same_id")
    private String sameId;
    @JsonProperty("img_json")
    private String imgJson;
    @JsonProperty("filter_dep")
    private List<String> filterDep;

    @JsonProperty("source_id")
    private String sourceId;

    @Excel(name = "来源", sortNum = 5)
    private String sourceName;

    @JsonProperty("add_time")
    private String addTime;
    @JsonProperty("status")
    private String status;
}
