package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.dto.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Controller
public class ArticleController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        System.out.println("=======");
        userDao.insert(form);

        /*System.out.println(form.getDate());
        System.out.println(form.getTitle());
        System.out.println(form.getAssign());
        System.out.println(form.getPerform());
        System.out.println(form.getFail());
        System.out.println("여기는 데이터 출력 구간이다 "+form.getDate());
        */

        //String sql = "INSERT INTO students (date, title, assign, perform, failed) "
        //        + "VALUES (?,?,?,?,?)";
        //PreparedStatement prep = c.preparedStatement(sql);
        ///// c 가 정의 되지 않음. 애초에 c가 쌩뚱 맞게 나오는 것도 말이 안되는 상황




        /*
        Statement statement = conn.createStatement();
        String sql = "INSERT INTO students (name, grade, score) "
                + "VALUES ('" + form.getDate() + "', '" + form.getTitle() + "', '" + form.getAssign() + "', '" + form.getPerform() + "', '" + form.getFail() + "')";
        stmt.executeUpdate(sql);
        */
        //conn 같은 경우에는, 필요가 없음 conn은 애초에 일반 자바 환경에서 데이터베이스에 연결하는거 확인하려는 connect인데 여기서는 필요가 없음
        //쿼리문 만드는 것도 복잡함

        /*
        Connection con = null;
        PreparedStatement pstmt = null;                            // SQL 문을 데이터베이스에 보내기위한 객체
        String SQL = "insert into ex2(date, title, assign, perform, failed) values(?, ?, ?, ?, ?)";
        try{
            pstmt.setString(1, "grasshopper");
            pstmt.setString(2, "5123");
            pstmt.setString(3, "유재석");
            pstmt.setString(4, "010-4921-1354");
            pstmt.setString(5, "allg@gmail.com");

        }
        */
        //setString 에서 에러가 계속 남 exception을 해줘야 한다고 하는데 다른 방법을 찾고 있는 중


        return "";
    }
}
