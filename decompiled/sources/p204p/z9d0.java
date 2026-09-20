package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum z9d0 implements od50 {
    MEDIA_CARD_MEDIA_TYPE_UNSPECIFIED(0),
    IMAGE(1),
    CANVAS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f280753a;

    z9d0(int i) {
        this.f280753a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f280753a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
