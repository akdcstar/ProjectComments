package net.comments.objects;

public interface CommentsTable {
    boolean hasCommentWithId(int id);

    boolean selectComment(String commentNumber);
}
