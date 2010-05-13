package com.test;

public class Student
{
    private String _number;
    private String _name;
    private int _score;

    public Student()
    {
        _number = null;
        _name = null;
        _score = 0;
        _number ="";
    }

    public Student(String num, String name, int score)
    {
        _number = num;
        _name = name;
        _score = score;
    }

    public String getNumber()
    {
        return _number;
    }

    public String getName()
    {
        return _name;
    }

    public int getScore()
    {
        return _score;
    }

    public void setNumber(String num)
    {
        _number = num;
    }

    public void setName(String name)
    {
        _name = name;
    }

    public void setScore(int score)
    {
        _score = score;
    }
    
    /**
     * assertEquals()被重載為多個版本，以應付各種的資料型態，
     * 像是int、String等等，如果是比較物件的話，
     * 則根據equals()方法傳回的true或false來比較，
     * 所以在您想要比較兩個物件的field是否相同時，
     * 您要重新定義您的equals()方法，
     * 例如在我們的Student中，我們的equals()可以定義如下：
     */
    public boolean equals(Object anObject) {
        if (anObject instanceof Student) {
            Student aStudent = (Student) anObject;
            return aStudent.getNumber().equals(getNumber())
                && aStudent.getName() == getName() && aStudent.getScore() == getScore();
        }
        return false;
    }
}