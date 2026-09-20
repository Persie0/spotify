package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum jq6 implements od50 {
    ATTESTATION_UNSPECIFIED(0),
    ATTESTATION_NONE(1),
    ATTESTATION_INDIRECT(2),
    ATTESTATION_DIRECT(3),
    ATTESTATION_ENTERPRISE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f114816a;

    jq6(int i) {
        this.f114816a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f114816a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
