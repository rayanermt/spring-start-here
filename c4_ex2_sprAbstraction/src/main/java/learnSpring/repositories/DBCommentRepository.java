/*
    Objects that work directly with a repository are called 'repository' or 'DAO' (data access object).

    This objects sends the published comments to an external database.
 */

package learnSpring.repositories;

import learnSpring.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
