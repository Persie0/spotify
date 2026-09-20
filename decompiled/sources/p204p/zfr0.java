package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum zfr0 implements od50 {
    PRIVACY_POLICY_CONSENT_TYPE_UNSPECIFIED(0),
    PRIVACY_POLICY_CONSENT_TYPE_NON(1),
    PRIVACY_POLICY_CONSENT_TYPE_COPPA(2),
    PRIVACY_POLICY_CONSENT_TYPE_IMPLICIT(3),
    PRIVACY_POLICY_CONSENT_TYPE_EXPLICIT(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f282395a;

    zfr0(int i) {
        this.f282395a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f282395a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
