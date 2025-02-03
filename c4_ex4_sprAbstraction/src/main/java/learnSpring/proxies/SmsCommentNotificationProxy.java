package learnSpring.proxies;

import learnSpring.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SMS")
public class SmsCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sendind SMS notification: " + comment.getText());
    }
}
