package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum mow implements od50 {
    BAD_CREDENTIALS(0),
    REGION_MISMATCH(1),
    PASSWORD_CHANGED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f145766a;

    mow(int i) {
        this.f145766a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f145766a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
