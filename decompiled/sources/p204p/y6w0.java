package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum y6w0 implements od50 {
    RELEASE_TAG_UNKNOWN(0),
    RELEASE_TAG_LATEST_RELEASE(1),
    RELEASE_TAG_PRE_RELEASE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f269912a;

    y6w0(int i) {
        this.f269912a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f269912a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
