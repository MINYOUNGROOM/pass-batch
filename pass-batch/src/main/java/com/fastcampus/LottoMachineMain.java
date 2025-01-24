package com.fastcampus;

import java.util.Arrays;

public class LottoMachineMain {
    public static void main(String[] args) {

        // 변수가 45개 필요하니까
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT];
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT ; i++) {
            balls[i] = new Ball(i + 1);
        }


        // LottoMachine 인스턴스가 생성된 것
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBall(balls);
        lottoMachine.mixBall();
        Ball[] result = lottoMachine.pickBalls();

        for( int i=0; i <result.length; i++){
            System.out.println(result[i].getNumber()); // 결과 배열 돌린거에서 숫자만 뽑아서 내줘라
        }

    }
}
