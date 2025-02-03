package learnSpring;

import learnSpring.config.projectConfiguration;
import learnSpring.model.Comment;
import learnSpring.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(projectConfiguration.class);

        Comment myComment = new Comment();
        myComment.setAuthor("Rayane");
        myComment.setText("Boa noite a todos!");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(myComment);
    }
}