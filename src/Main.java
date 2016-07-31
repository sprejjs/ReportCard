import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main mainMethod = new Main();
        mainMethod.printReportCard();
    }

    private void printReportCard() {
        ReportCard reportCard = new ReportCard("Vlad", "Spreys", 1124415, 138871822);

        //2012
        reportCard.addPaper(new Paper(2012, 405702, "Computing Technology in Society", 5, 15, "A-"));
        reportCard.addPaper(new Paper(2012, 405701, "Programming 1", 5, 15, "A+"));
        reportCard.addPaper(new Paper(2012, 145612, "Applied Communication", 5, 15, "C+"));
        reportCard.addPaper(new Paper(2012, 405021, "Enterprise Systems", 5, 15, "A-"));
        reportCard.addPaper(new Paper(2012, 735316, "Computer Network Principles", 5, 15, "B-"));
        reportCard.addPaper(new Paper(2012, 405704, "Programming 2", 5, 15, "A"));
        reportCard.addPaper(new Paper(2012, 406702, "Data and Process Modelling", 6, 15, "A"));

        //2013
        reportCard.addPaper(new Paper(2013, 406027, "IT Project Management", 6, 15, "B-"));
        reportCard.addPaper(new Paper(2013, 406703, "Logical Database Design", 6, 15, "B"));
        reportCard.addPaper(new Paper(2013, 406704, "Program Design and Construction", 6, 15, "B-"));
        reportCard.addPaper(new Paper(2013, 406701, "Software Development Practice", 6, 15, "A"));
        reportCard.addPaper(new Paper(2013, 406707, "Operating Systems", 6, 15, "A"));

        //2014
        reportCard.addPaper(new Paper(2014, 407702, "Applied Human Computer Interaction", 7, 15, "C-"));
        reportCard.addPaper(new Paper(2014, 407707, "Software Engineering", 7, 15, "B+"));

        //2015
        reportCard.addPaper(new Paper(2015, 407008, "Research and Development Project Part 1", 7, 15, "B-"));

        //2016
        reportCard.addPaper(new Paper(2016, 407703, "Research and Development Project", 7, 15, "B-"));
        reportCard.addPaper(new Paper(2016, 407713, "Distributed and Mobile Systems", 7, 15, "A-"));

        System.out.println(reportCard.toString());
    }

    class ReportCard {
        ArrayList<Paper> papers;
        String firstName;
        String lastName;
        int studentNumber;
        int nsiNumber;

        String getFullName() {
            return this.firstName + " " + this.lastName;
        }

        ReportCard(String firstName, String lastName, int studentNumber, int nsiNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentNumber = studentNumber;
            this.nsiNumber = nsiNumber;
            this.papers = new ArrayList<>();
        }

        void addPaper(Paper paper) {
            if (paper != null) {
                this.papers.add(paper);
            }
        }

        @Override
        public String toString() {
            String result = String.format("Full name: %s\n", this.getFullName());
            result += String.format("Student number: %s\n", this.studentNumber);
            result += String.format("Student NSI number: %s\n", this.nsiNumber);
            result += "--------------------------------------\n";

            for(Paper paper : this.papers) {
                result += paper.toString();
            }
            return result;
        }
    }

    class Paper {
        int year;
        int code;
        String title;
        int level;
        int points;
        String grade;

        Paper(int year, int code, String title, int level, int points, String grade) {
            this.year = year;
            this.code = code;
            this.title = title;
            this.level = level;
            this.points = points;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s    %s    %s    %s    %s    %s\n", year, code, title, level, points, grade);
        }
    }
}
