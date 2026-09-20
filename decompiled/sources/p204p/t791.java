package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum t791 implements od50 {
    TRANSITION_TYPE_UNSPECIFIED(0),
    TRANSITION_TYPE_AUTO(1),
    TRANSITION_TYPE_CUSTOM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f217736a;

    t791(int i) {
        this.f217736a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f217736a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
