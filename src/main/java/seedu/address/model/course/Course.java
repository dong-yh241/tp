package seedu.address.model.course;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

import seedu.address.model.assessment.UniqueAssessmentList;
import seedu.address.model.grade.UniqueGradeList;
import seedu.address.model.student.UniqueStudentList;

public class Course {
    private final CourseCode courseCode;
    private final UniqueStudentList students;
    private final UniqueAssessmentList assessments;
    private final UniqueGradeList grades;

    public Course(CourseCode courseCode) {
        requireAllNonNull(courseCode);
        this.courseCode = courseCode;
        this.students = new UniqueStudentList();
        this.assessments = new UniqueAssessmentList();
        this.grades = new UniqueGradeList();
    }

    public CourseCode getCourseCode() {
        return courseCode;
    }

    public UniqueStudentList getStudents() {
        return students;
    }

    public UniqueAssessmentList getAssessments() {
        return assessments;
    }

    public UniqueGradeList getGrades() {
        return grades;
    }

    public boolean isSameCourse(Course otherCourse) {
        if (otherCourse == this) {
            return true;
        }
        return otherCourse != null
                && otherCourse.getCourseCode().equals(getCourseCode());
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Course)) {
            return false;
        }
        Course otherCourse = (Course) other;
        return courseCode.equals(otherCourse.courseCode)
                && students.equals(otherCourse.students)
                && assessments.equals(otherCourse.assessments)
                && grades.equals(otherCourse.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode, students, assessments, grades);
    }
}
