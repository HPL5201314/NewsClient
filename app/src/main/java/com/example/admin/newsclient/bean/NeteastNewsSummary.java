package com.example.admin.newsclient.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ClassName: NeteastNewsSummary<p>
 * Author:oubowu<p>
 * Fuction: 网易新闻列表<p>
 * CreateDate:2016/2/13 20:09<p>
 * UpdateUser:<p>
 * UpdateDate:<p>
 */

        /*boardid": "ent2_bbs",
        "digest": "网易娱乐9月20日报道9月20日，“村长”李锐在微博发起求助，称自己的姐姐走丢了，并群求帮助：“我姐姐在长春一超市附近走丢了，大概上午十点半左右。就穿这身衣服，",
        "docid": "C1C9TV1B000380BQ",
        "imgsrc": "http://cms-bucket.nosdn.127.net/73e7549d57dc472682b7e040f4c67a0120160920013214.png",
        "lmodify": "2016-09-20 07:49:35",
        "ltitle": ""村长"李锐的姐姐在长春走丢 发文寻求帮助",
        "postid": "C1C9TV1B000380BQ",
        "priority": 94,
        "ptime": "2016-09-20 00:47:54",
        "replyCount": 6860,
        "source": "网易娱乐",
        "subtitle": "",
        "title": ""村长"李锐的姐姐在长春走丢 发文寻求帮助",
        "url": "http://3g.163.com/ent/16/0920/00/C1C9TV1B000380BQ.html",
        "url_3w": "http://ent.163.com/16/0920/00/C1C9TV1B000380BQ.html",
        "votecount": 6457*/


@JsonIgnoreProperties(ignoreUnknown = true)
public class NeteastNewsSummary {
    @JsonProperty("boardid")
    public String boardid;
    @JsonProperty("digest")
    public String digest;
    @JsonProperty("docid")
    public String docid;
    @JsonProperty("imgsrc")
    public String imgsrc;
    @JsonProperty("lmodify")
    public String lmodify;
    @JsonProperty("postid")
    public String postid;
    @JsonProperty("priority")
    public int priority;
    @JsonProperty("ptime")
    public String ptime;
    @JsonProperty("replyCount")
    public int replyCount;
    @JsonProperty("hasCover")
    public boolean hasCover;
    @JsonProperty("hasHead")
    public int hasHead;
    @JsonProperty("hasImg")
    public int hasImg;
    @JsonProperty("hasIcon")
    public boolean hasIcon;
    @JsonProperty("title")
    public String title;
    @JsonProperty("order")
    public int order;
    @JsonProperty("photosetID")
    public String photosetID;
    @JsonProperty("template")
    public String template;
    @JsonProperty("votecount")
    public int votecount;
    @JsonProperty("skipID")
    public String skipID;
    @JsonProperty("alias")
    public String alias;
    @JsonProperty("skipType")
    public String skipType;
    @JsonProperty("cid")
    public String cid;
    @JsonProperty("hasAD")
    public int hasAD;
    @JsonProperty("tname")
    public String tname;
    @JsonProperty("ename")
    public String ename;
    /**
     * title : 哈萨克斯坦中亚在建第1高楼爆炸起火
     * tag : photoset
     * imgsrc : http://img5.cache.netease.com/3g/2016/2/13/2016021318005710210.jpg
     * subtitle :
     * url : 00AN0001|110630
     */

    @JsonProperty("ads")
    public List<AdsEntity> ads;
    /**
     * imgsrc : http://img5.cache.netease.com/3g/2016/2/13/201602131446132dc50.jpg
     */

    @JsonProperty("imgextra")
    public List<ImgextraEntity> imgextra;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AdsEntity {
        @JsonProperty("title")
        public String title;
        @JsonProperty("tag")
        public String tag;
        @JsonProperty("imgsrc")
        public String imgsrc;
        @JsonProperty("subtitle")
        public String subtitle;
        @JsonProperty("url")
        public String url;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImgextraEntity {
        @JsonProperty("imgsrc")
        public String imgsrc;
    }
}
