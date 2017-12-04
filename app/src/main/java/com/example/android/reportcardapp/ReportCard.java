package com.example.android.reportcardapp;

public class ReportCard {

    private String mSubjectName;
    private int mGradeScored;

    public ReportCard(String subject, int grades) {
        mSubjectName = subject;
        mGradeScored = grades;
    }

    public String getSubjectName() {
        return mSubjectName;
    }

    public void setSubjectName(String subject) {
        mSubjectName = subject;
    }

    public int getGradeScored() {
        return mGradeScored;
    }

    public void setGradeScored(int score) {
        mGradeScored = score;
    }

    public String toString() {
        return "You scored " + mGradeScored + " marks in " + mSubjectName;
    }
}

