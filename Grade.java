public class Grade {
    public static String findGrade(int obtainedMarks, int totalMarks) {
        String grade = "NP";

        // check for obtained marks in range from teh 1 to total marks
        if(obtainedMarks >= 1 && obtainedMarks <= totalMarks) {
            // check for grades
            if(obtainedMarks < 25) {
                grade = "F";
            } else if(obtainedMarks >= 25 && obtainedMarks < 45) {
                grade = "E";
            } else if(obtainedMarks >= 45 && obtainedMarks < 50) {
                grade = "D";
            } else if(obtainedMarks >= 50 && obtainedMarks < 60) {
                grade = "C";
            } else if(obtainedMarks >= 60 && obtainedMarks < 80) {
                grade = "B";
            } else {
                grade = "A";
            }
        }

        // returning grade
        return grade;
    }
}