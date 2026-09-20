package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum hr20 implements od50 {
    HIDDEN_STATE_UNSPECIFIED(0),
    VISIBLE_CAN_HIDE(1),
    HIDDEN_CAN_UNHIDE(2),
    NOT_ELIGIBLE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f94320a;

    hr20(int i) {
        this.f94320a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f94320a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
