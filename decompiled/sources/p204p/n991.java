package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum n991 implements od50 {
    STYLE_BLOCK_TYPE_UNSPECIFIED(0),
    STYLE_BLOCK_TYPE_LOOP(1),
    STYLE_BLOCK_TYPE_SPINBACK(2),
    STYLE_BLOCK_TYPE_VINYL_STOP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f151757a;

    n991(int i) {
        this.f151757a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f151757a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
