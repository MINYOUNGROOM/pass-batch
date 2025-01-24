package com.fastcampus;

public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;


    @Override
    public void setBall(Ball[] balls) {
        this.balls = balls;
    }

    // Math.random ==> 0.0 <= x < 1.0  0.54734634
    //                 0.0 <= x < 45.0
    //             (int) 0 <= x < 45
    @Override
    public void mixBall() {
        for(int i=0 ;i< 10000; i++){
           int x1 =  (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
           int x2 = (int)(Math.random() * LottoMachine.RETURN_BALL_COUNT);
           if(x1 != x2){
               Ball tmp = balls[x1]; // 값을 치환할 때는 같은 type의 임시변수가 필요하다.
               balls[x1] = balls[x2];
               balls[x2] = tmp;
           }
        }

    }

    @Override
    public Ball[] pickBalls() {
        Ball[] result = new Ball[6]; // Ball 6개를 참조할 수 있는 배열
        for(int i=0 ; i<6 ; i++){
            result[i] = balls[i];
        }
        return result;
    }
}
