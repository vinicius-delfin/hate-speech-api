import java.util.List;
import java.util.Map;

public class ContentSafetyLabels {
        private String status;
        private List<Result> results;
        private Map<String, Double> summary;
        private SeverityScoreSummary severity_score_summary;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Map<String, Double> getSummary() {
        return summary;
    }

    public void setSummary(Map<String, Double> summary) {
        this.summary = summary;
    }

    public SeverityScoreSummary getSeverity_score_summary() {
        return severity_score_summary;
    }

    public void setSeverity_score_summary(SeverityScoreSummary severity_score_summary) {
        this.severity_score_summary = severity_score_summary;
    }
}
