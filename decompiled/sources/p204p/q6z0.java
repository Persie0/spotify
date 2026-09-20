package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum q6z0 implements od50 {
    CTA_TYPE_UNSPECIFIED(0),
    CTA_TYPE_URI(1),
    CTA_TYPE_EDITORIAL(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f185970a;

    q6z0(int i) {
        this.f185970a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f185970a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
