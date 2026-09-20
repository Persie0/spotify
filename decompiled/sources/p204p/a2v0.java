package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum a2v0 implements od50 {
    RECENT_TYPE_UNSPECIFIED(0),
    RECENT_TYPE_SAVED(1),
    RECENT_TYPE_PLAYED(2),
    RECENT_TYPE_SHARED(3),
    RECENT_TYPE_AUTO_GENERATED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f11730a;

    a2v0(int i) {
        this.f11730a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f11730a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
