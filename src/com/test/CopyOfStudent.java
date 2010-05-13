package com.test;

public class CopyOfStudent
{
    private String _number2;
    private String _name2;
    private int _score;
    String test;

    public CopyOfStudent()
    {
        _number2 = null;
        _name2 = null;
        _score = 0;
    }

    public CopyOfStudent(String num, String name, int score)
    {
        _number2 = num;
        _name2 = name;
        _score = score;
    }

    public String getNumber2()
    {
        return _number2;
    }

    public String getName2()
    {
        return _name2;
    }

    public int getScore()
    {
        return _score;
    }

    public void setNumber(String num)
    {
        _number2 = num;
    }

    public void setName(String name)
    {
        _name2 = name;
    }

    public void setScore(int score)
    {
        _score = score;
    }

}