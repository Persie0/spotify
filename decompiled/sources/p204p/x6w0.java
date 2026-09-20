package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum x6w0 implements od50 {
    RELEASE_TAG_UNKNOWN(0),
    RELEASE_TAG_LATEST_RELEASE(1),
    RELEASE_TAG_PRE_RELEASE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f258771a;

    x6w0(int i) {
        this.f258771a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f258771a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
