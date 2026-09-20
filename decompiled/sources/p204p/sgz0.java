package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum sgz0 implements od50 {
    SEGMENT_TYPE_UNSPECIFIED(0),
    SEGMENT_TYPE_TALK(1),
    SEGMENT_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f208965a;

    sgz0(int i) {
        this.f208965a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f208965a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
