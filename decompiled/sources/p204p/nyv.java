package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum nyv implements od50 {
    ENTRY_KIND_UNSPECIFIED(0),
    ENTRY_KIND_RESERVATION(1),
    ENTRY_KIND_PRESALE(2),
    ENTRY_KIND_GENERAL_SALE(3),
    ENTRY_KIND_MILESTONE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f159937a;

    nyv(int i) {
        this.f159937a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f159937a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
