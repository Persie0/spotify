package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum nq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_GROUP(0),
    ROW(1),
    COLUMN(2),
    BOX(3),
    TEXT(4),
    /* JADX INFO: Fake field, exist only in values array */
    LAZY_COLUMN(5),
    /* JADX INFO: Fake field, exist only in values array */
    LIST_ITEM(6),
    /* JADX INFO: Fake field, exist only in values array */
    CHECK_BOX(7),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTON(8),
    SPACER(9),
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH(10),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_REMOTE_VIEWS(11),
    REMOTE_VIEWS_ROOT(12),
    IMAGE(13),
    /* JADX INFO: Fake field, exist only in values array */
    LINEAR_PROGRESS_INDICATOR(14),
    CIRCULAR_PROGRESS_INDICATOR(15),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_GROUP(16),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_BUTTON(17),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_GROUP(18),
    /* JADX INFO: Fake field, exist only in values array */
    RADIO_BUTTON(19),
    RADIO_ROW(20),
    RADIO_COLUMN(21),
    SIZE_BOX(22),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f157189a;

    nq70(int i) {
        this.f157189a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m65385a() {
        if (this != UNRECOGNIZED) {
            return this.f157189a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
