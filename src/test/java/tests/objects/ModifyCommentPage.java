package tests.objects;

public interface ModifyCommentPage {
    BModifyCommentActions modifyActions();

    void fillCommentText(String text);

    void fillNumber(String number);

    void activateComment();

    void addCategory(int categoryNumber);

    boolean hasTextAlphanumericValidationError();

    boolean hasTextMaxLengthValidationError();

    boolean hasAnyTextValidationError();

    boolean hasTextScriptValidationError();
}
