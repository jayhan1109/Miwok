public class Student {

    private int scienceScore;
    private int mathScore;
    private String name;
    private char Grade;

    public Student(String name, int scienceScore, int mathScore){
        this.scienceScore=scienceScore;
        this.mathScore=mathScore;
        this.name=name;
    }

    public int getScienceScore() {
        return scienceScore;
    }

    public void setScienceScore(int scienceScore) {
        this.scienceScore = scienceScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public char getGrade() {
        if(mathScore>=90&&scienceScore>=90)
            Grade='A';
        else if((mathScore>=90&&scienceScore>=80)||(mathScore>=80&&scienceScore>=90))
            Grade='B';
        else if(mathScore>=80&&scienceScore>=80)
            Grade='C';
        else
            Grade='F';

        return Grade;
    }

    @Override
    public String toString() {
        return name+"'s Grade : "+getGrade()+"\n Science Score : "+scienceScore+"\n Math Score : "+mathScore+"\n Thank You !";
    }
}
