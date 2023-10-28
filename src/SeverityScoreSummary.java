import java.util.Map;

public class SeverityScoreSummary {
    private Map<String, Double> disasters;
    private Map<String, Double> health_issues;

    public Map<String, Double> getDisasters() {
        return disasters;
    }

    public void setDisasters(Map<String, Double> disasters) {
        this.disasters = disasters;
    }

    public Map<String, Double> getHealth_issues() {
        return health_issues;
    }

    public void setHealth_issues(Map<String, Double> health_issues) {
        this.health_issues = health_issues;
    }
}