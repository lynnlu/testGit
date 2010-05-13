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
     * assertEquals()�Q�������h�Ӫ����A�H���I�U�ت���ƫ��A�A
     * ���Oint�BString�����A�p�G�O������󪺸ܡA
     * �h�ھ�equals()��k�Ǧ^��true��false�Ӥ���A
     * �ҥH�b�z�Q�n�����Ӫ���field�O�_�ۦP�ɡA
     * �z�n���s�w�q�z��equals()��k�A
     * �Ҧp�b�ڭ̪�Student���A�ڭ̪�equals()�i�H�w�q�p�U�G
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