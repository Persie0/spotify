package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum g35 implements od50 {
    ANSWER_SOURCE_UNSPECIFIED(0),
    ANSWER_SOURCE_PRESET(1),
    ANSWER_SOURCE_USER_PROFILE(2),
    ANSWER_SOURCE_USER(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f76109a;

    g35(int i) {
        this.f76109a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f76109a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
