package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum inn0 implements od50 {
    CLAIM_FAIL_REASON_UNSPECIFIED(0),
    CLAIM_FAIL_REASON_ANONYMOUS(1),
    CLAIM_FAIL_REASON_NO_GRANT_FOUND(2),
    CLAIM_FAIL_REASON_GRANT_EXPIRED(3);


    /* JADX INFO: renamed from: a */
    public final int f104040a;

    inn0(int i) {
        this.f104040a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f104040a;
    }
}
