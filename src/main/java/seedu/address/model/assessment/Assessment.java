package seedu.address.model.assessment;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

public class Assessment {
    private final AssessmentName assessmentName;
    private final MaxScore maxScore;
    private final Weight weight;

    public Assessment(AssessmentName assessmentName, MaxScore maxScore, Weight weight) {
        requireAllNonNull(assessmentName, maxScore, weight);
        this.assessmentName = assessmentName;
        this.maxScore = maxScore;
        this.weight = weight;
    }

    public AssessmentName getAssessmentName() {
        return assessmentName;
    }

    public MaxScore getMaxScore() {
        return maxScore;
    }

    public Weight getWeight() {
        return weight;
    }

    public boolean isSameAssessment(Assessment otherAssessment) {
        if (otherAssessment == this) {
            return true;
        }
        return otherAssessment != null
                && otherAssessment.getAssessmentName().equals(getAssessmentName());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Assessment)) {
            return false;
        }
        Assessment otherAssessment = (Assessment) other;
        return assessmentName.equals(otherAssessment.assessmentName)
                && maxScore.equals(otherAssessment.maxScore)
                && weight.equals(otherAssessment.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessmentName, maxScore, weight);
    }

    @Override
    public String toString() {
        return assessmentName + " / " + maxScore + " / " + weight;
    }
}
