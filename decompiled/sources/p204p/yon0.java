package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum yon0 implements od50 {
    QUEUE_PERMISSION_RESULTS_ALLOWED(0),
    QUEUE_PERMISSION_RESULTS_ALLOWED_UNCAPPED_PNS(1),
    QUEUE_PERMISSION_RESULTS_DISALLOWED_MFT(2),
    QUEUE_PERMISSION_RESULTS_DISALLOWED_CAPPED_PNS(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f274710a;

    yon0(int i) {
        this.f274710a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f274710a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
