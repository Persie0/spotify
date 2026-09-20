package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum cb61 implements od50 {
    SURVEY_QUESTION_TYPE_UNKNOWN(0),
    SINGLE_SELECT(1),
    MULTI_SELECT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f36028a;

    cb61(int i) {
        this.f36028a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f36028a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
