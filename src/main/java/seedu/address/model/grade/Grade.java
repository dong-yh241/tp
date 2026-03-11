package seedu.address.model.grade;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

import seedu.address.model.assessment.AssessmentName;
import seedu.address.model.student.StudentId;

public class Grade {
    private final StudentId studentId;
    private final AssessmentName assessmentName;
    private final Score score;

    public Grade(StudentId studentId, AssessmentName assessmentName, Score score) {
        requireAllNonNull(studentId, assessmentName, score);
        this.studentId = studentId;
        this.assessmentName = assessmentName;
        this.score = score;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public AssessmentName getAssessmentName() {
        return assessmentName;
    }

    public Score getScore() {
        return score;
    }

    public boolean isSameGrade(Grade otherGrade) {
        if (otherGrade == this) {
            return true;
        }
        return otherGrade != null
                && otherGrade.getStudentId().equals(getStudentId())
                && otherGrade.getAssessmentName().equals(getAssessmentName());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Grade)) {
            return false;
        }
        Grade otherGrade = (Grade) other;
        return studentId.equals(otherGrade.studentId)
                && assessmentName.equals(otherGrade.assessmentName)
                && score.equals(otherGrade.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, assessmentName, score);
    }

    @Override
    public String toString() {
        return studentId + " / " + assessmentName + " / " + score;
    }
}
