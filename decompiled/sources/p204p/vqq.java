package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum vqq implements od50 {
    DENOMINATION_SELECTION_STATE_UNSPECIFIED(0),
    DENOMINATION_SELECTION_STATE_DISABLED(1),
    DENOMINATION_SELECTION_STATE_PRE_SELECTED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f243981a;

    vqq(int i) {
        this.f243981a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f243981a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
