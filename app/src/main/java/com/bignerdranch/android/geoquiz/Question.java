package com.bignerdranch.android.geoquiz;

/**
 * Created by makindevs on 11/05/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int texResId, boolean answerTrue){
        mTextResId = texResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
