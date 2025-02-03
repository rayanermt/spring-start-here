package learnSpring.proxies;

import learnSpring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
