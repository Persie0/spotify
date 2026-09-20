package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum l2i implements od50 {
    CARD_KIND_UNSPECIFIED(0),
    CARD_KIND_ROW(1),
    CARD_KIND_SMALL(2),
    CARD_KIND_LARGE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f129018a;

    l2i(int i) {
        this.f129018a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f129018a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
