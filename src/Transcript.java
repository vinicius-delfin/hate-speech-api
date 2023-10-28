public class Transcript {
    private String audio_url;
    private boolean content_safety;
    private String id;
    private String status;
    private String summary;
    private String severity_score_summary;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSeverity_score_summary() {
        return severity_score_summary;
    }

    public void setSeverity_score_summary(String severity_score_summary) {
        this.severity_score_summary = severity_score_summary;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public boolean isContent_safety() {
        return content_safety;
    }

    public void setContent_safety(boolean content_safety) {
        this.content_safety = content_safety;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
