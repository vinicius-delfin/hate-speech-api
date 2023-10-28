import java.util.List;

public class Result {
    private String text;
    private List<Label> labels;
    private int sentences_idx_start;
    private int sentences_idx_end;
    private Timestamp timestamp;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public int getSentences_idx_start() {
        return sentences_idx_start;
    }

    public void setSentences_idx_start(int sentences_idx_start) {
        this.sentences_idx_start = sentences_idx_start;
    }

    public int getSentences_idx_end() {
        return sentences_idx_end;
    }

    public void setSentences_idx_end(int sentences_idx_end) {
        this.sentences_idx_end = sentences_idx_end;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}