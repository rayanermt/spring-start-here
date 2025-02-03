package learnSpring.repositories;

import learnSpring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
