package dulleh.akhyou.Models;

import java.io.Serializable;
import java.util.List;

import dulleh.akhyou.Models.SourceProviders.SourceProvider;

public class Source implements Serializable{
    private String title;
    private String pageUrl;
    private String embedUrl;
    private List<Video> videos;
    private SourceProvider sourceProvider;

    public String getTitle() {
        return title;
    }

    public Source setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public Source setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public Source setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
        return this;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public Source setVideos(List<Video> videos) {
        this.videos = videos;
        return this;
    }

    public SourceProvider getSourceProvider() {
        return sourceProvider;
    }

    public void setSourceProvider(SourceProvider sourceProvider) {
        this.sourceProvider = sourceProvider;
    }

}
