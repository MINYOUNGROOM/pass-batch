package com.fastcampus;

/*
1. 1-45까지 쓰여져있는 ball을 로또 기계에 넣는다
2. 로또 기계에 있는 ball들을 섞는다
3. 섞인 ball중에서 6개를 꺼낸다
 */
public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;

    public void setBall(Ball[] balls); // Ball이 여러개를 받겠다.

    public void mixBall(); //Ball 들을 섞는다

    public Ball[] pickBalls(); // 6개의 ball을 반환한다



}