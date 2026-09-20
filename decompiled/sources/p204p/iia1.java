package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum iia1 implements od50 {
    UPSELL_RESULT_UNSPECIFIED(0),
    UPSELL_RESULT_HAS_UPSELL(1),
    UPSELL_RESULT_NO_UPSELL(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f102499a;

    iia1(int i) {
        this.f102499a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f102499a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
