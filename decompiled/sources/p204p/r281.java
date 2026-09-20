package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum r281 implements od50 {
    TOOLTIP_ALIGNMENT_UNKNOWN(0),
    TOOLTIP_ALIGNMENT_HORIZONTAL(1),
    TOOLTIP_ALIGNMENT_STACKED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f195082a;

    r281(int i) {
        this.f195082a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f195082a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
