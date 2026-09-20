package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum bgr0 implements od50 {
    PRIVACY_POLICY_TYPE_UNSPECIFIED(0),
    PRIVACY_POLICY_TYPE_NON(1),
    PRIVACY_POLICY_TYPE_EXPLICIT(2),
    PRIVACY_POLICY_TYPE_IMPLICIT(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f26993a;

    bgr0(int i) {
        this.f26993a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f26993a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
