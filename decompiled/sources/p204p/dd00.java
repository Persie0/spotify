package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum dd00 implements od50 {
    FRESH_FINDS_FORWARD_STATUS_UNSPECIFIED(0),
    FRESH_FINDS_FORWARD_STATUS_ACTIVE(1),
    FRESH_FINDS_FORWARD_STATUS_ALUMNI(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f47687a;

    dd00(int i) {
        this.f47687a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47687a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
