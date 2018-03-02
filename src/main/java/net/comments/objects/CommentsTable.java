package net.comments.objects;

public interface CommentsTable {
    boolean hasCommentWithId(int id);

    boolean hasCommentWithText(String commentText);

    boolean selectComment(String commentNumber);
}
