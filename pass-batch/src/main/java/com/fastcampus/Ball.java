package com.fastcampus;

// 불변객체
public class Ball {

    private int number;

    public Ball(int number){ // 이 생성자가 실행될 경우 항상 ball은 숫자를 가지고 있어야하니까
                            // 생성자로 번호가 넘어갈 수 잇게 해주기
        this.number = number;
    }

    // private으로 number를 해줬기 때문에 외부에서도 쓸 수 있게 getter 메소드를 만들어준다.
    public int getNumber(){
        return number;
    }
}
