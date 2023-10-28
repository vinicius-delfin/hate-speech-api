public class Transcript {
    private String audio_url;
    private boolean content_safety;
    private String status;
    private String id;
    private ContentSafetyLabels content_safety_labels;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContentSafetyLabels getContent_safety_labels() {
        return content_safety_labels;
    }

    public void setContent_safety_labels(ContentSafetyLabels content_safety_labels) {
        this.content_safety_labels = content_safety_labels;
    }
}