package com.study.board.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 생성을 DB에게 위임한다. (MySQL의 경우는 AUTO INCREMENT), 즉 특정 DB 벤더에 의존적이다. Id가 null일 경우 해당 객체의 Id를 DB의 AUTO_INCREMENT를 가져와 할당한다.
    private Integer id;

    private String title;

    private String content;
}
