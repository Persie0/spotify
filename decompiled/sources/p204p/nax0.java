package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum nax0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_POINT_VIEW_UNSPECIFIED(0),
    RESUME_POINT_VIEW_BASIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    RESUME_POINT_VIEW_FULL(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f152132a;

    nax0(int i) {
        this.f152132a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f152132a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
