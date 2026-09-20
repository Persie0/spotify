package p204p;

/* JADX INFO: renamed from: p.my */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC2144my implements od50 {
    ACT_UNKNOWN(0),
    ACT_HEADLINER(1),
    ACT_SUPPORTING(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f148241a;

    EnumC2144my(int i) {
        this.f148241a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f148241a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
