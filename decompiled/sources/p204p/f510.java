package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum f510 implements od50 {
    GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED(0),
    GEOBLOCK_BLOCKING_TYPE_TITLE(1),
    GEOBLOCK_BLOCKING_TYPE_DESCRIPTION(2),
    GEOBLOCK_BLOCKING_TYPE_IMAGE(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f65892a;

    f510(int i) {
        this.f65892a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f65892a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
