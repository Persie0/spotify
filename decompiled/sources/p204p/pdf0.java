package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum pdf0 implements od50 {
    PERMISSION_NEVER_SEEN(0),
    PERMISSION_TEMPORARILY_DENIED(1),
    PERMISSION_PERMANENTLY_DENIED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f176460a;

    pdf0(int i) {
        this.f176460a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f176460a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
