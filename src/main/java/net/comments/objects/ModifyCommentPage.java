package net.comments.objects;

public interface ModifyCommentPage {
    BModifyCommentActions modifyActions();

    void fillCommentText(String text);

    void fillNumber(String number);

    void activateComment();

    void addCategory(int categoryNumber);
}
