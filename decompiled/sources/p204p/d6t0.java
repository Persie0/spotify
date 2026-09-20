package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum d6t0 implements od50 {
    PUBLIC_KEY_CREDENTIAL_TYPE_UNSPECIFIED(0),
    PUBLIC_KEY_CREDENTIAL_TYPE_PUBLIC_KEY(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f45882a;

    d6t0(int i) {
        this.f45882a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f45882a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
