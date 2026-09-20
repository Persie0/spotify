package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum klw implements od50 {
    ENCRYPTION_SCHEME_UNKNOWN(0),
    ENCRYPTION_SCHEME_CBCS(1),
    ENCRYPTION_SCHEME_CTR(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f123971a;

    klw(int i) {
        this.f123971a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f123971a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
