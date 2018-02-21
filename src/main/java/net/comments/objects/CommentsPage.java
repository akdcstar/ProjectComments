package net.comments.objects;

public interface CommentsPage {
    void open();

    void newComment();

    CommentsActions commentsActions();

    CommentsTable currentComments();

    CommentsTable commentsFrom(int page);

    int commentsPagesSize();
}
