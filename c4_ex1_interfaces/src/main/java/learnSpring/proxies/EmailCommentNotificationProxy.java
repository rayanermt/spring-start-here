/*
    Objects who estabilish communication with external apps are called 'proxies'.

    This objects sends the comments by mail.
 */

package learnSpring.proxies;

import learnSpring.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
