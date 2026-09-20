package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum hy91 implements od50 {
    UI_STRING_KEY_UNSPECIFIED(0),
    PREHEADLINE(1),
    HEADLINE(2),
    TITLE(3),
    PRIMARY_BUTTON(4),
    EXPLANATION_TEXT(5),
    MARKER(6),
    SUB_MARKER(7),
    SOURCES(8),
    OTHER(9),
    POSITIVE_MESSAGE(10),
    NEGATIVE_MESSAGE(11),
    COMPLETION_BUTTON(12),
    SECONDARY_BUTTON(13),
    ROUND_NAME(14),
    COMPLETION_TIME_LABEL(15),
    SHARE_TEXT(16),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f96526a;

    hy91(int i) {
        this.f96526a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f96526a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
