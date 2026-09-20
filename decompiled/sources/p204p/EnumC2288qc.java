package p204p;

/* JADX INFO: renamed from: p.qc */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC2288qc implements od50 {
    NOTE_STATUS_UNSPECIFIED(0),
    ACCEPTED(1),
    PARTIALLY_ACCEPTED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f187222a;

    EnumC2288qc(int i) {
        this.f187222a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f187222a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
