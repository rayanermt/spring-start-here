package learnSpring;

import learnSpring.model.Comment;
import learnSpring.proxies.EmailCommentNotificationProxy;
import learnSpring.repositories.DBCommentRepository;
import learnSpring.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var myComment = new Comment();
        myComment.setAuthor("Rayane");
        myComment.setText("Bom dia a todos!");

        commentService.publishComment(myComment);
    }
}