package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum vjw implements od50 {
    UNKNOWN_STRATEGY(0),
    BEST_MATCHING(1),
    BACKEND_ADVISED(2),
    OFFLINED_FILE(3),
    CACHED_FILE(4),
    LOCAL_FILE(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f242076a;

    vjw(int i) {
        this.f242076a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f242076a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
